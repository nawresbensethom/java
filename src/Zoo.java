public class Zoo {
    Animal [] animals;
    String name;
    String city;
    static final int NBR_CAGES = 25;
    int capacity;

    public Zoo(String name, String city) {
        this.animals=new Animal[NBR_CAGES];
        this.name=name;
        this.city=city;
        this.capacity=0;
    }
    public boolean addAnimal(Animal animal){
        if(isZooFull()){
            System.out.println("Le zoo est plein.");
            return false;}
        for(int i=0;i<NBR_CAGES;i++){
        if (animals[i] != null && animals[i].equals(animal)) {
            System.out.println("L'animal existe deja");
            return false;}
        }
        animals[capacity] = animal;
        capacity++;
        return true;

    }
    public void displayAnimals(){
        for(int i=0;i<capacity;i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
        for(int i=0;i<capacity;i++){
            if ((animals[i] != null && animals[i].equals(animal))) {
                return i;
            }
            } return -1;
    }
    public boolean removeAnimal(Animal animal){
        for(int i=0;i<capacity;i++){
            if(animals[i] != null && animals[i].equals(animal)){
                for(int j=i;j<capacity-1;j++){
                    animals[j]=animals[j+1];
                }
                animals[capacity-1]=null;
                capacity--;
                return true;}
            }
        System.out.println("L'animal n'existe pas");
        return false;
        }
    public boolean isZooFull(){
        return (capacity >= NBR_CAGES);
    }
    public static Zoo comparerZoo(Zoo z1,Zoo z2){
        if(z1.capacity>z2.capacity){
            return z1;
        } else{ return z2;}

        }
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", capacity=" + capacity + "]";
    }
    }

