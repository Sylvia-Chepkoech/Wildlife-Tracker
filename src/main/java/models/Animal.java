package models;

import java.util.Objects;

public class Animal {

    public int id;
    public String name;
    public String type;

    //creating a constant non-endangered category
    public static final String CATEGORY_TYPE = "UNTHREATENED";


    public Animal(String name) {
        //throw exception if rangers attempt to submit an incomplete form
        if(name.equals("")){
            throw new IllegalArgumentException("Please enter an animal name");
        }
        this.name = name;
        type = CATEGORY_TYPE;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}

