
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] splitInput = input.split(",");
            if (oldest < Integer.valueOf(splitInput[1])) {
                oldest = Integer.valueOf(splitInput[1]);
                oldestName = splitInput[0];
            }                        
        }
        
        System.out.println("Age of the oldest: " + oldestName);
    }
}
