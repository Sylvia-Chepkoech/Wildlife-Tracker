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
        assertEquals(true, animal instanceof Animal);
    }

//    @Test
//    void getName_animalInstantiatesWithName_String() {
//        Animal animal = new Animal ("Lion");
//        assertEquals("Lion", animal.getName());
//    }
}