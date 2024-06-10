package model;

public class PackAnimal extends MansFriend{
    int packAnimalId;

    String family;
    public PackAnimal(int id, String class_, String order, String family){
        super(id, class_, order);
        this.family = family;
    }

}