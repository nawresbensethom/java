//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Belvedere","Tunis");
        Zoo zoo2 = new Zoo("Bel vue","Paris");
        Animal animal1 = new Animal("Felidae", "Lion", 5, true);
        Animal animal2 = new Animal("Reptiles", "Crocodile", 10, false);
        Animal animal3 = new Animal("Elephante", "Elephant", 20, true);
        Animal animal4 = new Animal("Savanah", "Tiger", 2, true);
        Animal anotherLion = new Animal("Felidae", "Lion", 5, true);
        System.out.println("l'ajout de " + animal1.name + " a reussi : " + zoo1.addAnimal(animal1));
        System.out.println("l'ajout de " + anotherLion.name + " a reussi : " + zoo1.addAnimal(anotherLion));
        System.out.println("l'ajout de " + animal2.name + " a reussi : " + zoo1.addAnimal(animal2));
        System.out.println("l'ajout de " + animal3.name + " a reussi : " + zoo1.addAnimal(animal3));
        System.out.println("La position de l'animal " + animal2.name + " est " + zoo1.searchAnimal(animal2));
        System.out.println("La position de l'animal " + anotherLion.name + " doublon est " + zoo1.searchAnimal(anotherLion));
        System.out.println("Animaux dans le zoo1 :");
        zoo1.displayAnimals();
        System.out.println("la suppression a reussi :" + zoo1.removeAnimal(animal3));
        System.out.println("Animaux dans le zoo1 :");
        zoo1.displayAnimals();
        System.out.println("l'ajout de " + animal1.name + " a reussi : " + zoo2.addAnimal(animal4));
        System.out.println("Animaux dans le zoo2 :");
        zoo2.displayAnimals();
        System.out.println("Le zoo avec le plus d'animaux : " + Zoo.comparerZoo(zoo1,zoo2));
    }
}