package org.example;


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



    }
}