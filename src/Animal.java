class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (obj instanceof Animal animal) {
            return name.equals(animal.name) && age == animal.age ;
        }
        return false;
    }
}
class Aquatic extends Animal {
    protected String habitat;


    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Aquatic [habitat=" + habitat + "]";
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Dolphin [swimmingSpeed=" + swimmingSpeed + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true; // Vérifie si les références pointent vers le même objet
        if (obj instanceof Aquatic aquatic) {
            return super.equals(aquatic) && habitat.equals(aquatic.habitat);
        }
        return false;
    }
}
class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Penguin [swimmingDepth=" + swimmingDepth + "]";
    }
}

