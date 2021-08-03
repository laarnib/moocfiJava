/**
 *
 * @author lb123
 */

import java.util.Scanner;

public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;
    
    public UserInterface (Container firstContainer, Container secondContainer, 
                            Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("");
            System.out.println("First: " + this.firstContainer.contains() + "/100");
            System.out.println("Second: " + this.secondContainer.contains() + "/100");
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            
            if (parts[0].equals("add")) {
                this.firstContainer.add(amount);
            }
            
            if (parts[0].equals("move")) {
                if (amount < 0) {
                    continue;
                } else if (amount > this.firstContainer.contains()) {
                    this.secondContainer.add(this.firstContainer.contains());
                    this.firstContainer.remove(amount);                    
                } else {
                    this.secondContainer.add(amount);
                    this.firstContainer.remove(amount);
                }
            }
            
            if (parts[0].equals("remove")) {
                this.secondContainer.remove(amount);
            }
            
        }
    }    
}
