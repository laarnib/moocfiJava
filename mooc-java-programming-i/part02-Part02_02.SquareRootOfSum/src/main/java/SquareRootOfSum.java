
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double squareRoot = 0.0;
        
        for (int i = 0; i < 2; i++) {
            sum += Integer.valueOf(scanner.nextLine());
        }
        
        squareRoot = Math.sqrt(sum);
        System.out.println((int)squareRoot);
    }
}
