package io.zipcoder.polymorphism;

import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Panda;
import io.zipcoder.pets.Pet;
import io.zipcoder.utilities.Console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    private static Console console = new Console(System.in, System.out);

    private static Dog dog = new Dog("Brian Griffin");
    private static Map<String, String> pets;


    public MainApplication(String name) {

        this.pets = new HashMap<>();
    }

    public static void main(String[] args) {
        intro();
        askPets();
    }

    public static void intro() {
        Integer numberOfPets = console.getIntegerInput("How many pets do you have?");
        console.print("You have " + numberOfPets + " pets!");

        if (numberOfPets == 2) {
            String pet1 = console.getStringInput("\nWhat kind of pet are they? (Enter Panda, Dog, or Cat)");
            String pet1Name = console.getStringInput("What is your " + pet1 + "'s name?");
            console.print("Your " + pet1 + " name is " + pet1Name + " it speaks" );
        }

        if (numberOfPets == 3) {
            String pet1 = console.getStringInput("\nWhat kind of pet are they? (Enter Panda, Dog, or Cat");
            String pet1Name = console.getStringInput("What is your " + pet1 + "'s name?");

        }


        }



    public static void askPets() {

    }


}