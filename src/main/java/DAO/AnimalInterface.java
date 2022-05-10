package DAO;

import models.Animal;


import java.util.List;

public interface AnimalInterface {
    //CREATE
    void add(Animal animal);

    //READ
    Animal getAnimalById(int id);
    List<Animal> getAllAnimal();

}
