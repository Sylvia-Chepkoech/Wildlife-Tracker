package models;

import java.util.List;

public class Location {
    private int locationId;
    private String locationName;


    private List<Sightings> sighting;


    public Location(String locationName) {
        this.locationName = locationName;

    }

    public String getLocationName() {
        return locationName;
    }
}
