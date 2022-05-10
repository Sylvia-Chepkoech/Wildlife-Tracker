package models;

import java.sql.Timestamp;

public class Sightings {
    private int id;
    private int rangerName;
    private int locationId;
    private Timestamp sightedAt;

    private Location location;
    private Ranger ranger;


    public Sightings(int rangerId, int locationId) {
        if (rangerName.equals("") || locationId.equals("")) {
            throw new IllegalArgumentException("Please enter  name.");
        this.rangerName = rangerName;
        this.locationId = locationId;
    }
}
