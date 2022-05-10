package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {
    private static Ranger ranger;

    @BeforeEach
    void setUp() {
        ranger = new Ranger("Josphat", "BN678", "josphat678@wildliferanger.com");
    }

    @Test
    public void Ranger_instantiatesCorrectly_true() {
       assertEquals(true, ranger instanceof Ranger);
    }

    @Test
    public void newRanger_instantiatesWithName() {
        assertEquals("Josphat", ranger.getRangerName());
    }

    @Test
    public void newRanger_insatntiatesWithBadegNumber() {
        assertEquals("BN678", ranger.getBadgeNumber());
    }

    @Test
    public void newRanger_instantiatesWithContactInfo() {
        assertEquals("josphat678@wildliferanger.com", ranger.getContactInfo());
    }
}