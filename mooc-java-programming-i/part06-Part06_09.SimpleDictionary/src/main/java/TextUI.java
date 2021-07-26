/**
 *
 * @author lb123
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            String word = "";
            
            if (command.equals("end")) {
                break;
            } 
            
            else if (command.equals("add")) {
                System.out.print("Word: ");
                word = scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                dictionary.add(word.toLowerCase(), translation.toLowerCase());
            }
            
            else if (command.equals("search")) {
                System.out.print("To be translated: ");
                word = scanner.nextLine();
                String translation = this.dictionary.translate(word.toLowerCase());
                
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }               
            }
            
            else {
                System.out.println("Unknown command");
            }
        }
        
        System.out.println("Bye bye!");
    }
}
