package models;

import java.sql.Timestamp;

public class Sightings {

    public int Id;

    public String animalType;
    public String animalName;
    public String rangerName;
    public String locationName;
    public Timestamp sightedAt;




    public Sightings(String animalType, String animalName, String rangerName, String locationName) {
        if (rangerName.equals("") || locationName.equals("") || animalType.equals("") || animalName.equals("")) {
            throw new IllegalArgumentException("Please enter the required fields");

        }
        this.animalType = animalType;
        this.animalName = animalName;
        this.rangerName = rangerName;
        this.locationName = locationName;
    }

    public int getId() {
        return Id;
    }

    public String getAnimal_type() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getRangerName() {
        return rangerName;
    }

    public String getLocationName() {
        return locationName;
    }

    public Timestamp getSightedAt() {
        return sightedAt;
    }
}

