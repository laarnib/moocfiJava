
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        int number = 0;
        
        System.out.println("Enter numbers:");
        while(true) {
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            allNumbers.addNumber(number);
            
            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            }
            
            if (number % 2 > 0) {
                oddNumbers.addNumber(number);
            }
        }
        
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());   
    }
}
