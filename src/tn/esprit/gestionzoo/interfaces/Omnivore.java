package tn.esprit.gestionzoo.interfaces;

public interface Omnivore<T> extends Herbivore<T>, Carnivore<T> {

    void eatPlantAndMeet(T food);
}