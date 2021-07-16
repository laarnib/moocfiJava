
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArchiveCollection> myCollection = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier?(empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            myCollection.add(new ArchiveCollection(identifier, name));
        }
        
        System.out.println("");
        System.out.println("==Items==");
        printArchiveCollection(myCollection);       
    }
    
    public static void printArchiveCollection(ArrayList<ArchiveCollection> collection) {
        ArrayList<ArchiveCollection> nonDuplicateItems = new ArrayList<>();

        for (ArchiveCollection item : collection) {
            if (!(nonDuplicateItems.contains(item))) {
                nonDuplicateItems.add(item);
            }
        }
        
        for (ArchiveCollection item : nonDuplicateItems) {
            System.out.println(item);
        }  
    }
}
