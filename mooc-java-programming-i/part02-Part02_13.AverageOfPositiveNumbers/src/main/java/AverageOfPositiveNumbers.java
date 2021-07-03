
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalPositiveNumGiven = 0;
        double average = 0.0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            // Exit loop
            if (number == 0) {
                break;
            }
            
            // Add positive number to sum and count positive number
            if (number > 0) {
                sum += number;
                ++totalPositiveNumGiven;
            }
        }
        
        // Do not calulate average if no positive number is given
        // Else, calculate average
        if (totalPositiveNumGiven == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sum / totalPositiveNumGiven;
            System.out.println(average);
        }
    }
}
