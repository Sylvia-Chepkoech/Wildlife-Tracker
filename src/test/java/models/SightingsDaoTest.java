package models;



import DAO.SightingsDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static org.junit.jupiter.api.Assertions.*;

import static DAO.DB.sql2o;

class SightingsDaoTest {
    private SightingsDao sightDao;
    private Connection conn;

    @BeforeEach

        public void setUp() throws Exception {
        Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "chechesylvia", "0718500898");
        sightDao = new SightingsDao();
        conn = sql2o.open();
    }

    @AfterEach
    public void tearDown() throws Exception {
        try(Connection con = sql2o.open()) {
            String deletePersonsQuery = "DELETE FROM sightings *;";
            con.createQuery(deletePersonsQuery).executeUpdate();
        }
    }


    @Test
    public void add_sightingToDatabase_true() {
        Sightings sighting = new Sightings("Endangered", "White rhino", "Josphat", "ZoneA");
        sightDao.add(sighting);
        assertTrue(sightDao.getAllSight().contains(sighting));
    }
}