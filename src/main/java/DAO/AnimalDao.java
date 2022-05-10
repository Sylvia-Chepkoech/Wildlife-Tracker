package DAO;

import models.Animal;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class AnimalDao implements AnimalInterface {


    @Override
    public void add(Animal animal) {
        try (Connection con = DB.sql2o.open()) {
            String insertQuery = "INSERT INTO animals (name, type) VALUES (:name, :type)";
            animal.id = (int) con.createQuery(insertQuery, true)
                    .addParameter("name", animal.getName())
                    .addParameter("type", animal.getType())
                    .executeUpdate()
                    .getKey();
        } catch (Sql2oException ex) {

        }

    }

    @Override
    public Animal getAnimalById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM animals WHERE id = :id")
                    .addParameter("id", id) //key/value pair, key must match above
                    .throwOnMappingFailure(false)
                    .executeAndFetchFirst(Animal.class); //fetch an individual item
        }
    }

    @Override
    public List<Animal> getAllAnimal() {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM animals") //raw sql
                    .executeAndFetch(Animal.class); //fetch a list
        }
    }
}
