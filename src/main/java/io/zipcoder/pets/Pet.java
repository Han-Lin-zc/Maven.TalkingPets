package io.zipcoder.pets;

public abstract class Pet {

    public String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }


}
