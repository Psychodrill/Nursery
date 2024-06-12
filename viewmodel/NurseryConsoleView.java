package viewmodel;

import java.time.LocalDate;
import java.util.ArrayList;

import interfaces.*;
import model.Animals;

public class NurseryConsoleView implements Publisher{

    private final Animals animals;
    private String result;

    public NurseryConsoleView(Animals animals) {
        this.animals=animals;
    }

    public void addAnimal(String []dataStrings) {

         animals.addAnimal(Integer.parseInt(dataStrings[0]), dataStrings[1], dataStrings[2], dataStrings[3], dataStrings[4], dataStrings[5], LocalDate.parse(dataStrings[6]));
    }


    @Override
    public void addAnimalable(Listener listener) {

        addAnimal(listener.getData());
    }

    @Override
    public ArrayList<String> getCommands(Listener listener) {
        return getCommands(listener.getData());
    }

    private ArrayList<String> getCommands(String[] dataStrings) {
        return animals.getCommands(Integer.parseInt(dataStrings[0]));
    }

    @Override
    public void addCommand(Listener listener) {

        addCommand(listener.getData());
    }

    private void addCommand(String[] dataStrings) {
        animals.learnCommand(Integer.parseInt(dataStrings[0]), dataStrings[1]);
    }
    
}
