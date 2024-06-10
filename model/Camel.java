package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Camel extends PackAnimal {

    int camelId;
    String name;
    LocalDate birthdate;
    
    public Camel(int id, String class_, String order, String family, String name, LocalDate birthdate) {
        super(id, class_, order, family);

        //camelId=
        this.name = name;
        this.birthdate=birthdate;
    }

}
