package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {

        PrisonCell cell = new PrisonCell("Mike");
        cell.getName();

        System.out.println(cell.getName());


    }
}
