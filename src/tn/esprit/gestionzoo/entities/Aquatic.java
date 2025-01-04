package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic() {
        super();
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("Aquatic animal is eating meat.");
        } else {
            System.out.println("Aquatic animal cannot eat this type of food.");
        }
    }
}
