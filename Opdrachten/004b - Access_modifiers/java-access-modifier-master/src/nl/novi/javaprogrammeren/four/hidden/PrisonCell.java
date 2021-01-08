package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell {

    Inhabitant inhabitantVar;
    String name;

    public PrisonCell(String prisonerName) {
        inhabitantVar = new Inhabitant(prisonerName);
        name = inhabitantVar.getName();
    }

    Inhabitant getInhabitantVar() {
        return inhabitantVar;
    }

    void setInhabitantVar(Inhabitant inhabitantVar) {
        this.inhabitantVar = inhabitantVar;
    }

    public String getName(){
        return name;
    }
}
