
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            } 
            
            try {
                int number = Integer.valueOf(input);
                System.out.println(number * number * number);
            } catch (Exception e) {
                System.out.println("Not a number");
            }
        }
    }
}
