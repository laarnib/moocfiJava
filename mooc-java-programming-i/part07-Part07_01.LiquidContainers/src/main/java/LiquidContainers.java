
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            
            // Add liquid to first container
            if (parts[0].equals("add")) {
                if (first + amount > 100 || amount < 0) {
                    first = 100;
                } else {
                    first += amount;
                }
            }
            
            // Move liquid from first container to second container
            if (parts[0].equals("move")) {
                if (second + amount > 100 && amount > first) {
                    first = 0;
                    second = 100;
                } else if (second + amount > 100 && amount < first) {
                    first -= amount;
                    second = 100;
                } else if (amount > first && second + amount < 100) {
                    second = first;
                    first = 0;
                } else if (amount < 0) {
                    second = second;
                    first = first;
                } else {
                    first -= amount;
                    second += amount;
                }
            }
            
            // Remove liquid from second container
            if (parts[0].equals("remove")) {
                if (second == 0) {
                    second = second;
                } else if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        }
    }
}
