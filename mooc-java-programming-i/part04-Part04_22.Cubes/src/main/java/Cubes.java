
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            int number = 0;
            
            if (input.equals("end")) {
                break;
            }
            
            try {
                number = Integer.valueOf(input); 
            } catch (NumberFormatException e) {
                System.out.println("Cannot parsed input to an Integer");
            }
            
            System.out.println(number * number * number);
        }    
    }
}
