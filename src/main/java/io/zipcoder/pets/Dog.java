package io.zipcoder.pets;

public class Dog extends Pet {

    public String name;

    public Dog(String name) {
        super("Brian Griffin");
        this.name = name;
    }



    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String speak() {
        return "I'm not drunk!";
    }
}
