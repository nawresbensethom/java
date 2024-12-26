public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.animals=new Animal[25];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }
    public void addAnimal(Animal animal, int i) {
        if (i < 0 || i >= animals.length) {
            System.out.println("Index invalide. L'animal ne peut pas être ajouté.");
        } else {
            animals[i] = animal;
        }
    }
    public void displayZoo() {
        System.out.println("Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]");
        System.out.println("Liste des animaux :");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }
    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
