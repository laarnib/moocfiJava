
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNegativeNumbers = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Exit loop if number is zero
            if (number == 0) {
                break;
            }
            
            // Count negative number
            if (number < 0) {
                ++totalNegativeNumbers;
            }
        }
        
        System.out.println("Number of negative numbers: " + totalNegativeNumbers);
    }
}
