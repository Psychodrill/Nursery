package model;

import java.time.LocalDate;
import java.util.Date;

public class Horse extends PackAnimal {

    int horseId;
    String name;
    LocalDate birthdate;
    public Horse(int id, String class_, String order, String family, String name, LocalDate birthdate) {
        super(id, class_, order, family);

        //horseId=
        this.name = name;
        this.birthdate=birthdate;
    }
}
