package view;
import java.util.Scanner;
import interfaces.Publisher;
public class ConsoleView implements interfaces.Listener{
    // public static final String ANSI_RED = "\u001B[31m";
    // public static final String ANSI_RESET = "\u001B[0m";
    private final Publisher nConsView;
    private String[] dataStrings = new String[4];
    public ConsoleView(Publisher  nConsView) {
        this.nConsView = nConsView;
    }

    public void run(){
       
        Scanner scanner = new Scanner(System.in);
        while (true) {
           
            //System.out.println("Input Id, Toyname, Chance, Count, separated by space ...");
            System.out.println("1 - Add Animal");
            System.out.println("2 - Edit Chance by id");
            System.out.println("3 - Launch lotteryMachine");
            System.out.println("4 - Close");
            String choice = scanner.nextLine();
            if(choice.equals("1")){
                System.out.println("Input Id, Class, Order, Family, Name, BirthDate separated by space ...");
                String next= scanner.nextLine();
                dataStrings = next.split("\\s");
                nConsView.addLottable(this);
            }
            else if(choice.equals("2")){
                System.out.println("Input Id and Chance, separated by space ...");
                String next= scanner.nextLine();
                dataStrings = next.split("\\s");
                nConsView.editLottable(this);

            }
            else if(choice.equals("3")){

                nConsView.launchLottery(this);

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
