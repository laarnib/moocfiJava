
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countPositiveNum = 0;
        double averageOfPositiveNumbers = 0.0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum = sum + number;
                countPositiveNum++;
            }
        }
        
        if (countPositiveNum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            averageOfPositiveNumbers = (double) sum / countPositiveNum;
            System.out.println(averageOfPositiveNumbers);
        }
    }
}
