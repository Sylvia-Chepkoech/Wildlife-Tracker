package models;

import java.util.List;

public class Ranger {
    private int id;
    private String rangerName;
    private String badgeNumber;
    private String contactInfo;

    private List<Sightings> sighting;

    public Ranger(String rangerName, String badgeNumber, String contactInfo) {
        this.rangerName = rangerName;
        this.badgeNumber = badgeNumber;
        this.contactInfo = contactInfo;
    }

    public String getRangerName() {
        return rangerName;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
