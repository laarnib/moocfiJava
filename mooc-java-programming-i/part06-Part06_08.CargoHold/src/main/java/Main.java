import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Suitcase torchSuitcase = new Suitcase(40);
        packSuitcase(torchSuitcase);
        
        Suitcase kellySuitcase = new Suitcase(25);
        packSuitcase(kellySuitcase);
        
        Hold hold = new Hold(100);
        hold.addSuitcase(torchSuitcase);
        hold.addSuitcase(kellySuitcase);
        
        System.out.println("");
        System.out.println("The suitcases in the hold contain the following items");
        hold.printItems();
    }
    
    public static void packSuitcase(Suitcase suitcase) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Enter the name and weight of the item.");
        System.out.println("Type 'exit' to name or -1 on weight to quit");
        while (true) {
            System.out.print("Item: ");
            String itemName = scanner.nextLine();
            
            if (itemName.equals("exit") || itemName.isEmpty()) {
                break;
            }
            
            System.out.print("Weight (kg): ");
            int weight = Integer.valueOf(scanner.nextLine());
            
            if (weight < 0) {
                break;
            }
            
            Item item = new Item(itemName, weight);
            suitcase.addItem(item);       
            System.out.println("");
        }        
    }
}
