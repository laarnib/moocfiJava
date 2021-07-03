
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0.0;
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
        
        average = (double) sum / totalNumbersGiven;
        System.out.println("Average of the numbers: " + average);
    }
}
