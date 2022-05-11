package models;

import DAO.AnimalDao;
import models.Animal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.jupiter.api.Assertions.*;

class AnimalDaoTest {

    private AnimalDao animalDao;
    private Connection conn;

    Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "chechesylvia", "0718500898");


    @BeforeEach
    public void setUp() throws Exception {
        animalDao = new AnimalDao();
        conn = sql2o.open();
    }

    @AfterEach
    public void tearDown() throws Exception {
        try (Connection con = sql2o.open()) {
            String deletePersonsQuery = "DELETE FROM animals *;";
            con.createQuery(deletePersonsQuery).executeUpdate();
        }
    }

    @Test
    public void addAnimal_returnId() {
        Animal chui = new Animal("Chui");
        animalDao.add(chui);
        int chuiId = chui.getId();
        assertEquals(1,chuiId);
    }

    @Test
    public void getAnimalById_returnAnimal() {
        Animal kangaroo = new Animal("Kangaroo");
        animalDao = new AnimalDao();
        animalDao.add(kangaroo);

        assertEquals(kangaroo, animalDao.getAnimalById(1));

    }

    @Test
    public void getAllAnimal_returnAnimals() {
        Animal chui =new Animal("Chui");
        Animal warthog = new Animal("warthog");
        Animal hyena = new Animal("hyena");

        animalDao.add(chui);
        animalDao.add(warthog);
        animalDao.add(hyena);

        assertEquals(3, animalDao.getAllAnimal().size());

    }
}