
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int listSize = list.size();
        int biggestNumber = list.get(0);
        for (int i = 1; i < listSize; i++) {
            if (biggestNumber < list.get(i)) {
                biggestNumber = list.get(i);
            }
        }
        
        System.out.println("The greatest number: " + biggestNumber);
    }
}
