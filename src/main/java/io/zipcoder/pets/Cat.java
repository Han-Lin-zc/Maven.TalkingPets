package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat(String name) { super(name); }

    public String speak() {
        return "I don't have a mouth.";
    }
}
