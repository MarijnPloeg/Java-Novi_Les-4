package nl.novi.javaprogrammeren.four.hidden;

public class HumanMaker {

    static String humanName;

    public HumanMaker(String name) {
        Human humanVar = new Human(name);
        humanVar.setName(name);
        humanName = humanVar.getName();
    }

    public static String getName(){
        return humanName;
    }

}
