package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.Human;
import nl.novi.javaprogrammeren.four.hidden.HumanMaker;

public class MainFour {
    public static void main(String[] args) {

        new HumanMaker("Marijn");

        System.out.println(HumanMaker.getName());
    }
}
