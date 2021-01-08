package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    private static int tappedBeerAmount = 0;

    public Beer(String brand) {
        this.brand = brand;
        tappedBeerAmount++;
        System.out.println("Dit is biertje nummer: "+ tappedBeerAmount);
    }

    public static int getTappedBeersAmount() {
        return tappedBeerAmount;
    }
}
