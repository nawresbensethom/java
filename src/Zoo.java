public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int NBR_CAGES = 3;
    private int capacity;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.capacity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }


    public void addAnimal(Animal animal)throws ZooFullException {
        if (capacity >= NBR_CAGES) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter un nouvel animal.");
        }
        animals[capacity] = animal;
        capacity++;
    }
    public int getNumberOfAnimals() {
        return capacity;
    }
}
