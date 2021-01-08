package nl.novi.javaprogrammeren.one;

public class MainOne {

    public static void main(String[] args) {

        Person sjaak = new Person("Sjaak", 30);
        sjaak.ageOneYear();
        System.out.println(sjaak.toString());

    }
}
