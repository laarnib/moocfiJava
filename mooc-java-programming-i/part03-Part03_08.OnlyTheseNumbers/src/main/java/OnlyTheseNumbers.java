
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        int listSize = numbers.size();
        
        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());
                
        
        // Print numbers
        for (int i = start; i <= end; i++) {
            if (i == listSize) {
                break;
            }
            System.out.println(numbers.get(i));
        } 
    }
}
