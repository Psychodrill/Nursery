package model;

public class Pet extends MansFriend{
    int petId;
    String family;

    public Pet(int id, String class_, String order, String family){
        super(id, class_, order);
        this.family = family;
    }

}