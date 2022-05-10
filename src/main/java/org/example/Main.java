package org.example;


import DAO.AnimalDao;
import DAO.SightingsDao;
import models.Animal;
import models.Sightings;

public class Main {
    public static void main(String[] args) {
        SightingsDao sightDao = new SightingsDao();
        System.out.println("Hello world!");
        Sightings sighting = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");
        sightDao.add(sighting);
        System.out.println(sightDao.getAllSight().contains(sighting));

        Animal animal = new Animal("kuku");
        AnimalDao animalDao = new AnimalDao();
        animalDao.add(animal);
        System.out.println(animalDao.getAllAnimal().contains(animal));



    }
}