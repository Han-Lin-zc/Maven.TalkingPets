package io.zipcoder.pets;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }



    private String speak() {
        return "";
    }
}
