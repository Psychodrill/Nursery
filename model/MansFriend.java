package model;

import java.util.ArrayList;

import interfaces.Animalable;

public class MansFriend implements Animalable {
    int id;
    String class_;
    String order;
    ArrayList<String> commands = new ArrayList<String>();
    public MansFriend(int id, String class_, String order){
        this.id= id;
        this.class_=class_;
        this.order=order;
    }
    @Override
    public ArrayList<String> getCommands() {

        return commands;
    }
    @Override
    public void addCommand(String command) {

       this.commands.add(command);
    }
    @Override
    public int getId() {

        return id;
    }

}
