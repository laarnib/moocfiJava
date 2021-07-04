
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number > 0) {
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
