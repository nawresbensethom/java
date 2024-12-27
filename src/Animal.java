public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family,String name, int age, boolean isMammal) {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
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
