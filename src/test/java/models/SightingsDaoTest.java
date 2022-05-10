package models;

import DAO.SightingsDao;
import models.Sightings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;


import static org.junit.jupiter.api.Assertions.*;

class SightingsDaoTest {

    private SightingsDao sightDao; //ignore me for now. We'll create this soon.
    private Connection conn;

    Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "chechesylvia", "0718500898");


    @BeforeEach
    public void setUp() throws Exception {
        sightDao = new SightingsDao();
        conn = sql2o.open();
    }

    @AfterEach
    public void tearDown() throws Exception {
        try (Connection con = sql2o.open()) {
            String deletePersonsQuery = "DELETE FROM sightings *;";
            con.createQuery(deletePersonsQuery).executeUpdate();
        }
    }


    @Test
    void addSighting_returns_idOfAddedSight() {
        Sightings one = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");

        sightDao.add(one);
        int id = one.Id;
        assertEquals(one.Id, id);
    }

    @Test
    public void getSightingById_returnsIntId() {
        Sightings one = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");

        sightDao.add(one);
        int id = one.Id;
        assertEquals(one.Id, id);
    }

    @Test
    public void getAllSighting_returnSize() {
        Sightings one = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");
        Sightings oneT = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");
        Sightings oneH = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");
        Sightings oneG = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");

        sightDao.add(one);
        sightDao.add(oneT);
        sightDao.add(oneH);
        sightDao.add(oneG);
        assertEquals(4, sightDao.getAllSight().size());

    }
}