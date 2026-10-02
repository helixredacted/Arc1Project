import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        boolean restart;
        do {
            restart = false;
            System.out.println("Starting the program...");






        }




            public static boolean runProgram(Scanner input) {
            if (checkForRestart(input)) return true;
            else {
                return false;
            }
        }

        //Prompts the player if they want to restart or not
        public static boolean checkForRestart(Scanner input) {
            String choice = "";
            boolean isValid = false;
            while (!isValid) {
                System.out.print("Would you like to play again? (Yes or No) ");
                choice = input.nextLine().toLowerCase();
                if (choice.equals("yes") || choice.equals("no")) {
                    isValid = true;
                }
                else {
                    System.out.println("That is not a yes or no!");
                }
            }
            return choice.equalsIgnoreCase("yes");
        }
    }
}