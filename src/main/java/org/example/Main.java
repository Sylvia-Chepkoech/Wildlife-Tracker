package org.example;


<<<<<<< HEAD
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
=======
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {

        //getting hompage
        get("/", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        //getting sightingform
        get("/SightingForm", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "SightingForm.hbs");
        }, new HandlebarsTemplateEngine());

        //getting all sightings
        get("/Sightings", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Sightings.hbs");
        }, new HandlebarsTemplateEngine());
>>>>>>> front-end



    }
}