package models;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    void setUp() {
     animal = new Animal("Lion");
    }

    @Test
    public void animal_instantiatesCorrectly_true() {
        Animal animal = new Animal("Lion");
        assertEquals(true, animal instanceof Animal);
    }

    @Test
    public void getName_animalInstantiatesWithName_Lion() throws Exception {
        assertEquals("Lion", animal.getName());
    }

    @Test
    public void getId_animalInstantiatesWithId() throws Exception {
        assertTrue(animal.getId() > 0);
    }

    @Test
    void getType_animalInstantiatesWithType_Type() {
        assertEquals("UNTHREATENED", animal.getType());
    }
}