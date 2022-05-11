package org.example;

import DAO.AnimalDao;
import DAO.EndangeredDao;
import DAO.SightingsDao;
import models.Animal;
import models.Endangered;
import models.Sightings;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;


public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");

        //getting homepage
        get("/", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        //getting normal animal form
        get("/SightingForm", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "SightingForm.hbs");
        }, new HandlebarsTemplateEngine());

        //getting all sightings
        get("/Sightings", (request, response) ->{
            Map<String, Object> model = new HashMap<>();

            SightingsDao sightDao = new SightingsDao();
            List<Sightings> sightings = sightDao.getAllSight();
            model.put("allsightings", sightings);

            return new ModelAndView(model, "Sightings.hbs");
        }, new HandlebarsTemplateEngine());

        //getting ranger value
        post("/sightform", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();

            String animName = request.queryParams("animalName");
            String animType = request.queryParams("animalType");
            String rangNAme = request.queryParams("rangerName");
            String badge = request.queryParams("badgeNumber");
            String contact = request.queryParams("contactInfo");
            String locate = request.queryParams("locationName");


            Sightings firstsighting = new Sightings(animName, animType, rangNAme, locate);
            SightingsDao sightDao = new SightingsDao();

            Animal normal = new Animal(animName);
            AnimalDao animDao = new AnimalDao();
            animDao.add(normal);
            System.out.println(animDao.getAllAnimal());
            sightDao.add(firstsighting);
            List<Sightings> sightings = sightDao.getAllSight();
            model.put("allsightings", sightings);

            return new ModelAndView(model, "Sightings.hbs");
        }), new HandlebarsTemplateEngine());

        //getting ranger values of endangered animals
        post("/rareform", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();

            String animName = request.queryParams("animalName");
            String animType = request.queryParams("animalType");
            String rangNAme = request.queryParams("rangerName");
            String locate = request.queryParams("locationName");
            String animalHealth = request.queryParams("health");
            String animalAge = request.queryParams("age");





            Endangered rare = new Endangered(animName,animalHealth,animalAge);
            EndangeredDao endangeredDao = new EndangeredDao();
            endangeredDao.add(rare);

            System.out.println(endangeredDao.getAllEndangered());

            Animal normal = new Animal(animName);
            AnimalDao animDao = new AnimalDao();
            animDao.add(normal);

            Sightings firstsighting = new Sightings(animName, animType, rangNAme, locate);
            SightingsDao sightDao = new SightingsDao();

            sightDao.add(firstsighting);
            List<Sightings> sightings = sightDao.getAllSight();
            model.put("allsightings", sightings);

            return new ModelAndView(model, "Sightings.hbs");
        }), new HandlebarsTemplateEngine());

        // getting rare animal form
        get("/dangerform", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Endangered.hbs");
        }, new HandlebarsTemplateEngine());

        //getting all rare animals
        get("/allrare", (request, response) ->{
            Map<String, Object> model = new HashMap<>();

            EndangeredDao endangeredDao =new EndangeredDao();
            List<Endangered> allrareanimals = endangeredDao.getAllEndangered();

            System.out.println(allrareanimals);
            model.put("rareanimals", allrareanimals);
            return new ModelAndView(model, "Rare.hbs");
        }, new HandlebarsTemplateEngine());


    }


}