package io.zipcoder.polymorphism;


import io.zipcoder.zoo.AnimalFarm;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        AnimalFarm animalFarm = new AnimalFarm();
        animalFarm.numberOfPets();
        animalFarm.placePetsInFarm();
        animalFarm.printPets();
    }

}