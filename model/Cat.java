package model;

import java.time.LocalDate;
import java.util.Date;

public class Cat extends Pet {

    int catId;
    String name;
    LocalDate birthdate;

    public Cat(int id, String class_, String order, String family, String name, LocalDate birthdate) {
        super(id, class_, order, family);

        //camelId=
        this.name = name;
        this.birthdate=birthdate;
    }
    
}
