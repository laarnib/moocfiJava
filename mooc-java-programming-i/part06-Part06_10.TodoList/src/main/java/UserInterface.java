/**
 *
 * @author lb123
 */

import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        String command = "";
        
        while(true) {
            System.out.print("Command: ");
            command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if(command.equals("add")) {
                System.out.print("To add: ");
                this.list.add(scanner.nextLine());
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                this.list.remove(Integer.valueOf(scanner.nextLine()));
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
