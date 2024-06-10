package model;

import java.time.LocalDate;
import java.util.Date;

public class Donkey extends PackAnimal {
    int donkeyId;
    String name;
    LocalDate birthdate;
    public Donkey(int id, String class_, String order, String family, String name, LocalDate birthdate) {
        super(id, class_, order, family);

        //donkeyId=
        this.name = name;
        this.birthdate=birthdate;
    }

}
