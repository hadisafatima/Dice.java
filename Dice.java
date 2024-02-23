import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int total = 6  ;
    public Dice() {
        Scanner sc = new Scanner(System.in) ;
        Random random = new Random() ;
        String again = "yes" ;
        while(!again.equalsIgnoreCase("no")){
            int val = random.nextInt(total) + 1 ;
            System.out.println("Your value is : " + val);
            System.out.println("\nDo u want to roll the dice again? (yes/no)");
            again = sc.next() ;

            if (!again.equalsIgnoreCase("yes") && !again.equalsIgnoreCase("no")){
                System.out.println("\nEnter either \"yes\" or \"no\"-");
                again = sc.next() ;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Dice dice = new Dice() ;
    }
}
