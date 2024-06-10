import model.LotteryMachine;
import view.ConsoleView;
import viewmodel.NurseryConsoleView;
import interfaces.*;

public class Application {
 
    public void run(){

        LotteryMachine lm = new LotteryMachine();
        Publisher lmConsView= new NurseryConsoleView(lm);
        ConsoleView consView = new ConsoleView(lmConsView);
        consView.run();

    }
}
