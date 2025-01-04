package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.interfaces.*;
public class Main {
    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic();
        Penguin penguin = new Penguin();
        Terrestrial terrestrial = new Terrestrial();

        System.out.println("Testing Aquatic:");
        aquatic.eatMeat(Food.MEAT);
        aquatic.eatMeat(Food.PLANTS);

        System.out.println("\nTesting Penguin:");
        penguin.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.BOTH);

        System.out.println("\nTesting Terrestrial:");
        terrestrial.eatMeat(Food.MEAT);
        terrestrial.eatPlants(Food.PLANTS);
        terrestrial.eatPlantAndMeet(Food.BOTH);
    }
}

