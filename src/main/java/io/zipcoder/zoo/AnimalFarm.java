package io.zipcoder.zoo;

import io.zipcoder.utilities.Console;

public class AnimalFarm {

    Console console = new Console(System.in,System.out);




    public Integer numberOfPets() {
        Integer numberEnter = console.getIntegerInput("How many pets do you have?");
        if (numberEnter < 0) {
            console.print("Please try again!");
        }
        return numberEnter;
    }


    public Integer typeOfPet() {
        Integer type = console.getIntegerInput("Select: \n1 for Panda \n2 for Dog \n3 for Cat");
        if (type > 3 || type < 0) {
            console.print("Please try again!");
        }
        return type;
    }

    public String nameOfPet() {
        return console.getStringInput("What is your pet's name?");
    }
}
