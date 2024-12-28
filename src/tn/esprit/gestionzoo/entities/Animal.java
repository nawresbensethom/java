package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family,String name, int age, boolean isMammal) {
        this.family=family;
        this.name=name;
        setAge(age);
        this.isMammal=isMammal;
    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge d'un animal ne peut pas être négatif.");
        }
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
    @Override //redefinition de la classe Object
    public boolean equals(Object obj){
        if(this == obj) return true;//verifie si l'objet courant est identique a celui passe en parametre
        if((obj == null) || (getClass() != obj.getClass())) return false;//verifie si les classes de 2 objets sont de la meme classe
        Animal animal = (Animal)obj;//cast de l'objet obj en un objet de type Animal
        return name.equals(animal.name);//compare les noms de 2 objets retourne true s'ils sont identiques
    }
}
