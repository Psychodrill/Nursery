package model;

import java.time.LocalDate;
import java.util.Date;

public class Hamster extends Pet {

    int hamsterId;
    String name;
    LocalDate birthdate;

    public Hamster(int id, String class_, String order, String family, String name, LocalDate birthdate) {
        super(id, class_, order, family);

        //camelId=
        this.name = name;
        this.birthdate=birthdate;
    }
}
