package nl.novi.javaprogrammeren.two;

public abstract class Dog extends Animal{

    Animal animalVar = new Animal();

    public Animal getAnimalVar() {
        return animalVar;
    }

    public void setAnimalVar(Animal animalVar) {
        this.animalVar = animalVar;
    }

    public Dog(int amountOfLegs, String name) {
        animalVar.amountOfLegs = amountOfLegs;
        animalVar.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name= " + animalVar.name +
                ", Amount of legs= " +animalVar.amountOfLegs +
                '}';
    }

    public abstract void pet();

}
