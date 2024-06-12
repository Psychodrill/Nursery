package model;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

import interfaces.*;
import logger.Log;

public class Animals {
    private static final Logger log = Log.log(Animals.class.getName());
    // private ArrayList<String> messages = new ArrayList<String>();

    private ArrayList<MansFriend> animals = new ArrayList<MansFriend>();

    private Animalable findItem(int id){
        Animalable result = null;
        for(Animalable item:animals){
            if(item.getId()==id){
                result = item;
            }
        }
        return result;
    } 


    public void addAnimal(int id, String class_, String order, String family, String species, String name, LocalDate birthdate) {

        if(species.toLowerCase().equals("cat")){
            this.animals.add(new Cat(id, class_, order, family, name, birthdate));
        }
        if(species.toLowerCase().equals("dog")){
            this.animals.add(new Dog(id, class_, order, family, name, birthdate));
        }
        if(species.toLowerCase().equals("hamster")){
            this.animals.add(new Hamster(id, class_, order, family, name, birthdate));
        }
        if(species.toLowerCase().equals("horse")){
            this.animals.add(new Horse(id, class_, order, family, name, birthdate));
        }
        if(species.toLowerCase().equals("camel")){
            this.animals.add(new Camel(id, class_, order, family, name, birthdate));
        }
        if(species.toLowerCase().equals("donkey")){
            this.animals.add(new Donkey(id, class_, order, family, name, birthdate));
        }

    }
    public ArrayList<String> getCommands(int id){

        Animalable animal = findItem(id);
        return animal.getCommands();
    }

    public void learnCommand(int id, String command) {

        Animalable item = findItem(id);
        item.addCommand(command);
        
    }
}
