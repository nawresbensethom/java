//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        Zoo myZoo = new Zoo("Safari Zoo", "Paris", 10);
        myZoo.addAnimal(lion, 0);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

    }
}