package models;

import java.util.Objects;

public class Animal {
    public String id;
    public String name;
    public String category_type;

    //creating a constant non-endangered category
    public static final String CATEGORY_TYPE = "UNTHREATENED";

    public Animal(String name) {
        //throw exception if rangers attempt to submit an incomplete form
        if(name.equals("")){
            throw new IllegalArgumentException("Please enter an animal name");
        }
        

    }
}
