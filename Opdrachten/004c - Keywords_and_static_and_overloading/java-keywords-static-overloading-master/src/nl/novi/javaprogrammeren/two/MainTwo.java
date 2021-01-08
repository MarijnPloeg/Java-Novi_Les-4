package nl.novi.javaprogrammeren.two;

public class MainTwo {

    public static void main(String[] args) {
        Dog tammie = new Dog(4, "Tamrakker") {

            @Override
            public void pet() {
                System.out.println("Pet animal");
            }
        };

        System.out.println(tammie.toString());
    }
}
