package DAO;

import models.Endangered;

import java.util.List;

public interface EndangeredInterface {
    //CREATE
    void add(Endangered endangered);

    //READ
    Endangered getEndangeredById(int id);
    List<Endangered> getAllEndangered();
}
