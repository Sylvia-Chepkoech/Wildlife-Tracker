package DAO;

import models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class SightingsDao implements SightingInterface{

    @Override
    public void add(Sightings sight) {
        try (Connection con = DB.sql2o.open()) {
            String insertQuery = "INSERT INTO sightings (animalName, animalType, rangerName, locationName, sightedAt) VALUES (:animalName, :animal_type, :rangerName, :locationName, :now()";
            sight.Id = (int) con.createQuery(insertQuery, true)
                    .addParameter("animalName", sight.getAnimalName())
                    .addParameter("animal_type", sight.getAnimal_type())
                    .addParameter("rangerName", sight.getRangerName())
                    .addParameter("locationName", sight.getLocationName())
                    .executeUpdate()
                    .getKey();
        } catch (Sql2oException ex) {
            System.out.println(ex); //"oops "we have an error!"
        }
    }

    @Override
    public Sightings getSightById(int id) {
        return null;
    }

    @Override
    public List<Sightings> getAllSight() {
        return null;
    }

    @Override
    public void update(Sightings sight) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void delete(int id) {

    }
}
