
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("");
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (input.equals("add")) {
                if (firstContainer + amount >= 100) {
                    firstContainer = 100;
                } else if (amount < 0) {
                    firstContainer = firstContainer;
                } else {
                    firstContainer += amount;
                }
            }
            
            if (input.equals("move")) {
                if (secondContainer + amount >= 100 && amount <= firstContainer) {
                    secondContainer = 100;
                    firstContainer -= amount;
                } else if (secondContainer + amount < 100 && amount > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else if (secondContainer + amount > 100 && amount > firstContainer) {
                    secondContainer = 100;
                    firstContainer = 0;
                } else if (amount < 0) {
                    secondContainer = secondContainer;
                    firstContainer = firstContainer;
                } else {
                    secondContainer += amount;
                    firstContainer -= amount;
                }
            }
            
            if (input.equals("remove")) {
                if (amount < 0) {
                    secondContainer = secondContainer;
                } else if (amount > secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }
        }
    }
}
