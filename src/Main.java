public class Main {
    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        Terrestrial terrestrial = new Terrestrial();

        Dolphin specificDolphin = new Dolphin("Cetacea", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin specificPenguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctic", 10.0f);

        System.out.println(aquatic);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrial);
        System.out.println(specificDolphin);
        System.out.println(specificPenguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
