package models;

import java.sql.Timestamp;

public class Sightings {

    public int Id;

    private String animal_type;
    private String animalName;
    private String rangerName;
    private String locationName;
    private Timestamp sightedAt;

    private Location location;
    private Ranger ranger;


    public Sightings(String animal_type, String animalName, String rangerName, String locationName) {
        if (rangerName.equals("") || locationName.equals("") || animal_type.equals("") || animalName.equals("")) {
            throw new IllegalArgumentException("Please enter the required fields");

        }
        this.animal_type = animal_type;
        this.animalName = animalName;
        this.rangerName = rangerName;
        this.locationName = locationName;
    }

    public int getId() {
        return Id;
    }

    public String getAnimal_type() {
        return animal_type;
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

