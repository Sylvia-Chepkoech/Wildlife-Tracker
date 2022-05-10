package models;

import java.sql.Timestamp;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sightings)) return false;
        Sightings sightings = (Sightings) o;
        return Id == sightings.Id && Objects.equals(animalType, sightings.animalType) && Objects.equals(animalName, sightings.animalName) && Objects.equals(rangerName, sightings.rangerName) && Objects.equals(locationName, sightings.locationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, animalType, animalName, rangerName, locationName, sightedAt);
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

