package interfaces;

import java.util.ArrayList;


public interface Publisher {
    //void addLottable(Listener listener);
  //  void editLottable(Listener listener);
  //  void launchLottery(Listener listener);
    void addAnimalable(Listener listener);
    ArrayList<String> getCommands(Listener listener);
    void addCommand(Listener listener);
}
