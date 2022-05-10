package models;

public class Endangered extends Animal{
    public String health;
    public String age;
    public static final String CATEGORY_TYPE = "Endangered";

    public Endangered(String name, String health, String age) {
        super(name);
        //throw exception if rangers attempt to submit an incomplete form
        if(name.equals("") || health.equals("") || age.equals("")) {
            throw new IllegalArgumentException("Please enter all input fields");
        }
        this.health = health;
        this.age = age;
        type = CATEGORY_TYPE;
    }
    //get and set methods for endangered animals

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
