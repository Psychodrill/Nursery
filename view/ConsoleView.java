package view;

import java.io.FileOutputStream;
import java.util.Scanner;
import interfaces.Publisher;
public class ConsoleView implements interfaces.Listener{
    // public static final String ANSI_RED = "\u001B[31m";
    // public static final String ANSI_RESET = "\u001B[0m";
    private final Publisher nConsView;
    private String[] dataStrings = new String[7];
    //private int animalId;
    public ConsoleView(Publisher  nConsView) {
        this.nConsView = nConsView;
    }

    public void run(){
       
        Scanner scanner = new Scanner(System.in);
        while (true) {
           
            //System.out.println("Input Id, Toyname, Chance, Count, separated by space ...");
            System.out.println("1 - Add Animal");
            System.out.println("2 - Show animal commands");
            System.out.println("3 - To learn new command");
            System.out.println("4 - Close");
            String choice = scanner.nextLine();
            if(choice.equals("1")){
                System.out.println("Input Class, Order, Family, Species, Name, BirthDate separated by space ...");
                String next= scanner.nextLine();
                dataStrings = next.split("\\s");
                nConsView.addAnimalable(this);

            }
            else if(choice.equals("2")){
                System.out.println("Input Id of animal ...");
                String next= scanner.nextLine();
                dataStrings = next.split("\\s");
                //animalId = Integer.parseInt(next);
                //nConsView.editLottable(this);
                System.out.println(nConsView.getCommands(this));

            }
            else if(choice.equals("3")){

                System.out.println("Input animal Id and command to learn separated by space ...");
                String next= scanner.nextLine();
                dataStrings = next.split("\\s");
                nConsView.addCommand(this);

            }
            else if(choice.equals("4")){
                scanner.close();
                return;

            }
            else{
                System.out.println("You are input unacceptable symbol");
            }
            
        }
    }

    public String[] getData(){
        return dataStrings;
    }

    @Override
    public void showResult(String result) {
        System.out.println(result);
        
    }

}
