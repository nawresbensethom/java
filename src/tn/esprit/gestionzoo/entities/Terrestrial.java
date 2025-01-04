package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestrial() {
        super();
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial animal is eating meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat this type of food.");
        }
    }


    public void eatPlants(Food plant) {
        if (plant == Food.PLANTS || plant == Food.BOTH) {
            System.out.println("Terrestrial animal is eating plants.");
        } else {
            System.out.println("Terrestrial animal cannot eat this type of food.");
        }
    }

    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat this type of food.");
        }
    }


}
