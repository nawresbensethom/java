//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Zoo zoo = new Zoo("Parc Animalier", "Paris");

            // Test avec des animaux
            try {
                zoo.addAnimal(new Animal("Félin", "Lion", 5, true));
                System.out.println("Animal ajouté. Nombre total d'animaux : " + zoo.getNumberOfAnimals());

                zoo.addAnimal(new Animal("Canidé", "Loup", 3, true));
                System.out.println("Animal ajouté. Nombre total d'animaux : " + zoo.getNumberOfAnimals());

                zoo.addAnimal(new Animal("Oiseau", "Aigle", 2, false));
                System.out.println("Animal ajouté. Nombre total d'animaux : " + zoo.getNumberOfAnimals());

                // Ajout d'un animal de plus (devrait échouer)
                zoo.addAnimal(new Animal("Reptile", "Crocodile", 7, false));
            } catch (ZooFullException e) {
                System.out.println(e.getMessage());
            }

            // Test avec un animal ayant un âge négatif
            Animal invalidAnimal = new Animal("Félin", "Chat", -3, true);
        } catch (Exception e) {
            System.out.println("Une erreur inattendue s'est produite : " + e.getMessage());
        }
    }
    }
