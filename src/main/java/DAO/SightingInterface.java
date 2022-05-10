package DAO;

import models.Sightings;

import java.util.List;

public interface SightingInterface {
    //CREATE
    void add(Sightings sight);

    //READ
    Sightings getSightById(int id);
    List<Sightings> getAllSight();

    //UPDATE
    void update(Sightings sight);

    //DELETE
    void deleteAll();
    void delete(int id);



}
