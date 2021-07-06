
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int sum = 0;
        double average = 0.0;
        
        // Read user input adding them on a list until user gives -1
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }
            
            numberList.add(input);
        }
        
        // Compute sum of the numbers on the list
        for (Integer number : numberList) {
            sum += number;
        }
        
        // Compute the average of the numbers on the list
        average = (double) sum / numberList.size();
        
        // Print average
        System.out.println("");
        System.out.println("Average: " + average);
    }
}
