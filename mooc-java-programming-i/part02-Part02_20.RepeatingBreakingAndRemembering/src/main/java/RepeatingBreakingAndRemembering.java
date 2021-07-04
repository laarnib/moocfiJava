
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNumbersGiven = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;
        double average = 0.0;
        
        
        System.out.println("Give numbers:");
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            // Break from the loop
            if (number == -1) {
                break;
            }
            
            // Count even and odd numbers
            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
                     
            sum += number;
            totalNumbersGiven++;
        }
        
        average = (double) sum / totalNumbersGiven;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbersGiven);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
