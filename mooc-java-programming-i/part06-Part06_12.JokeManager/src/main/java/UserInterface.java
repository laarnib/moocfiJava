/**
 *
 * @author lb123
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokes;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    }
    
    public void start() {
        while(true) {
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = this.scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.jokes.addJoke(joke);
            }
            
            else if(command.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            }
            
            else if(command.equals("3")) {
                this.jokes.printJokes();
            }
            
            else {
                System.out.println("Invalid command");
            }
        }    
    }
}
