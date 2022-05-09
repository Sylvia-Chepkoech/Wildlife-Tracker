package models;

public class Endangered extends Animal{
    public String health;
    public String age;
    public static final String CATEGORY_TYPE = "Endangered";

    public Endangered(String name, String health, String age) {
        super(name);
        this.health = health;
        this.age = age;
    }
}
