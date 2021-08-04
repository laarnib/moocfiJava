
/**
 *
 * @author lb123
 */

import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start() {
        getCommand();
        scanner.close();
    }
    
    public void getCommand() {
        while(true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                addBirdToList();
            } else if (command.equals("Observation")) {
                addsCountToBirdObservation();
            } else if (command.equals("All")) {
                printAllBirds();
            } else if (command.equals("One")) {
                printSpecifiedBird();
            } else {
                System.out.println("Invalid Command!");
            }
        }
    }
    
    public void addBirdToList() {
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        System.out.print("Name in Latin: ");
        
        String latinName = scanner.nextLine();
        birds.add(new Bird(birdName, latinName));    
    }
    
    public void addsCountToBirdObservation() {
        String birdName = askUserForBirdName();
        boolean found = false;
        
        for (Bird b : birds) {
           if (b.getBirdName().equals(birdName)) {
               found = true;
               b.addOneToObservartion();
           }
        }
        
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printSpecifiedBird() {
        String birdName = askUserForBirdName();
        boolean found = false;
        
        for (Bird b : birds) {
            if (b.getBirdName().equals(birdName)){
                System.out.println(b);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Bird not found in database.");
        }
    }
    
    private String askUserForBirdName() {
        System.out.print("Bird? ");
        String bird = scanner.nextLine();

        return bird;
    }
}
