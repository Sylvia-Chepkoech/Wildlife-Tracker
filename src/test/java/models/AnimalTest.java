package models;

import java.util.List;
import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {


    private Animal animal;
    private Endangered endangered;

    @BeforeEach
    void setUp() {
     animal = new Animal("Lion");
     endangered = new Endangered("Kangaroo", "Okay", "Newborn");
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

    @Test
    void getHealth_animalInstantiatesWithHealthStatus_Okay() {
        assertEquals("Okay", endangered.getHealth());
    }

    @Test
    public void getAge_animalInstantiatesWithAge_Newborn() {
        assertEquals("Newborn", endangered.getAge());
    }
}