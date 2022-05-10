package models;

import java.sql.Timestamp;

public class Sightings {
    private int id;
    private int rangerId;
    private int locationId;
    private Timestamp sightedAt;

    private Location location;
    private Ranger ranger;


    public Sightings(int rangerId, int locationId) {
        this.rangerId = rangerId;
        this.locationId = locationId;
    }
}
