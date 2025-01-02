class Zoo {
    Animal[] aquaticAnimals;
    String name;
    String city;
    int nbrCages;
    int count;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.aquaticAnimals = new Animal[10];
        this.count = 0;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (count < aquaticAnimals.length) {
            aquaticAnimals[count] = aquatic;
            count++;
        } else {
            System.out.println("Zoo est plein");
        }

    }

    public void displayAquaticAnimals() {
        for (int i = 0; i < count; i++) {
            if (aquaticAnimals[i] != null) {
                System.out.println(aquaticAnimals[i]);
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < count; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.swimmingDepth > maxDepth) {
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByTYpe (){
        int numberOfPenguins = 0;
        int numberOfDolphins = 0;
        for (int i = 0; i < count; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                numberOfPenguins ++;
            }else if(aquaticAnimals[i] instanceof Dolphin){
                numberOfDolphins ++;
            }
        }
       System.out.println("le nombre de pengouins dans le zoo= " +numberOfPenguins);
        System.out.println("le nombre de dauphins dans le zoo= " +numberOfDolphins);
    }
}
