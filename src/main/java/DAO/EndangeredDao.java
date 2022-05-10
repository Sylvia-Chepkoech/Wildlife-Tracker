package DAO;

import models.Animal;
import models.Endangered;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class EndangeredDao implements EndangeredInterface {

    @Override
    public void add(Endangered endangered) {
        try (Connection con = DB.sql2o.open()) {
            String insertQuery = "INSERT INTO animals (name, type, health, age) VALUES (:name, :type, :health, :age)";
            endangered.id = (int) con.createQuery(insertQuery, true)
                    .addParameter("name", endangered.getName())
                    .addParameter("type", endangered.getType())
                    .addParameter("health", endangered.getHealth())
                    .addParameter("age", endangered.getAge())
                    .executeUpdate()
                    .getKey();
        } catch (Sql2oException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public Endangered getEndangeredById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM animals WHERE id = :id")
                    .addParameter("id", id) //key/value pair, key must match above
                    .throwOnMappingFailure(false)
                    .executeAndFetchFirst(Endangered.class); //fetch an individual item
        }
    }

    @Override
    public List<Endangered> getAllEndangered() {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM animals") //raw sql
                    .executeAndFetch(Endangered.class); //fetch a list
        }

    }
}
