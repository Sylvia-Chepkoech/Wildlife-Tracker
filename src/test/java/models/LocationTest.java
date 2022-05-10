package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    private static Location location;

    @BeforeEach
    void setUp() {
        location = new Location ("Zone A");
    }

    @Test
    public void newLocation_instantiatesCorrectly_true() {
        assertNotNull(location);
    }

    @Test
    public void newLocation_instantiatesWithNAme_true() {
        assertEquals("Zone A", location.getLocationName());
    }
}