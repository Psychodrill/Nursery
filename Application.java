import model.Animals;
import view.ConsoleView;
import viewmodel.NurseryConsoleView;
import interfaces.*;

public class Application {
 
    public void run(){

        Animals animals = new Animals();
        Publisher nConsView= new NurseryConsoleView(animals);
        ConsoleView consView = new ConsoleView(nConsView);
        consView.run();

    }
}
