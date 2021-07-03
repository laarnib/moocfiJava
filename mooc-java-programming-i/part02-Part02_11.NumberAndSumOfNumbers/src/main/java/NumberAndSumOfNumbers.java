
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNumbersGiven = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());   
            
            // Exit loop
            if (number == 0) {
                break;
            }
            
            sum += number;
            ++totalNumbersGiven;
        }
        
        System.out.println("Number of numbers: " + totalNumbersGiven);
        System.out.println("Sum of the numbers: " + sum);
    }
}
