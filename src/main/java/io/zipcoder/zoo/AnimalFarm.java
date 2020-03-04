package io.zipcoder.zoo;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Panda;
import io.zipcoder.pets.Pet;
import io.zipcoder.utilities.Console;


public class AnimalFarm {

    Integer numOfPets;
    Console console = new Console(System.in,System.out);
    Pet newPet;
    Pet[] petsStorage;


    public void numberOfPets() {
        Integer numberEnter = console.getIntegerInput("How many pets do you have?");
        if (numberEnter <= 0) {
            console.print("Please try again!\n");
            numberOfPets();
        } else {
            this.numOfPets = numberEnter;
        }
    }


    public Integer typeOfPet() {
        Integer type = console.getIntegerInput("Select: \n1 for Panda \n2 for Dog \n3 for Cat");
        if (type > 3 || type <= 0) {
            console.print("Not a valid entry! Please try again!\n");
            typeOfPet();
        }
        return type;
    }


    public String nameOfPet() {
        return console.getStringInput("What is your pet's name?");
    }


    public void placePetsInFarm() {
        this.petsStorage = new Pet[this.numOfPets];
        for (int i = 0; i < petsStorage.length; i++) {
            resultTypeOfPet();
            petsStorage[i] = this.newPet;
        }
    }


    public void resultTypeOfPet() {
        Integer result = typeOfPet();
        if (result == 1) {
            this.newPet = new Panda(nameOfPet());
        } else if (result == 2) {
            this.newPet = new Dog(nameOfPet());
        } else {
            this.newPet = new Cat(nameOfPet());
        }
    }


    public void printPets() {
        for (Pet pet : petsStorage) {
            String type = petType(pet);
            String speak = pet.speak();
            console.print(pet.getName() + " is a " + type + " that says \"" + speak + "\"\n");
        }
    }

    public String petType(Pet pet) {
        if (pet instanceof Panda) {
            return "panda";
        } else if (pet instanceof Dog) {
            return "dog";
        } else return "cat";
    }
}
