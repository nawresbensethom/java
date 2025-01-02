//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zoo zoo=new Zoo("belvedere","tunis");
        Aquatic aquatic1 = new Dolphin("fish","dolphin",1,true,"oceean",23.4f);
        zoo.addAquaticAnimal(aquatic1);
        Aquatic aquatic2 = new Penguin("fish","penguin",2,true,"oceean",50f);
        zoo.addAquaticAnimal(aquatic2);
        Aquatic aquatic3 = new Penguin("fish","babyPenguin",1,true,"oceean",60f);
        zoo.addAquaticAnimal(aquatic3);
        zoo.displayAquaticAnimals();
        aquatic1.swim();
        aquatic2.swim();
        System.out.println(zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByTYpe();
        System.out.println(aquatic2.equals(aquatic3));


    }
}