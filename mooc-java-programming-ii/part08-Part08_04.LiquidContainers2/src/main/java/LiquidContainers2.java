
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("");
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (input.equals("add")) {
                firstContainer.add(amount);
            } 
            
            if (input.equals("move")) {
                if (amount > firstContainer.contains()) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(amount);
                } else {
                    secondContainer.add(amount);
                    firstContainer.remove(amount);
                }                
            }
            
            if (input.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
