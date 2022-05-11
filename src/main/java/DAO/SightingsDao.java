package DAO;

import models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class SightingsDao implements SightingInterface{

    @Override
    public void add(Sightings sight) {
        try (Connection con = DB.sql2o.open()) {
            String insertQuery = "INSERT INTO sightings (animalname, animaltype, rangername, locationname, sightedat) VALUES (:animalName, :animalType, :rangerName, :locationName, now())";
            sight.Id = (int) con.createQuery(insertQuery, true)
                    .addParameter("animalName", sight.getAnimalName())
                    .addParameter("animalType", sight.getAnimalType())
                    .addParameter("rangerName", sight.getRangerName())
                    .addParameter("locationName", sight.getLocationName())
                    .executeUpdate()
                    .getKey();
        } catch (Sql2oException ex) {

        }
    }

    @Override
    public Sightings getSightById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM sightings WHERE id = :Id")
                    .addParameter("Id", id) //key/value pair, key must match above
                    .executeAndFetchFirst(Sightings.class); //fetch an individual item
        }
    }

    @Override
    public List<Sightings> getAllSight() {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM sightings") //raw sql
                    .executeAndFetch(Sightings.class); //fetch a list
        }
    }



}
