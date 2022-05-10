package models;

import java.util.List;

public class Location {
    private int locationId;
    private String locationName;
    private String locationDescription;

    private List<Sightings> sighting;


    public Location(String locationName, String locationDescription) {
        this.locationName = locationName;
        this.locationDescription = locationDescription;
    }
}
