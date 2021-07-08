
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumOfBirthYears = 0;
        int countYears = 0;
        double average = 0.0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            String[] splitInput = input.split(",");
            if(longestName.length() < splitInput[0].length()) {
                longestName = splitInput[0];
            }
            
            sumOfBirthYears += Integer.valueOf(splitInput[1]);
            countYears++;
        }
        
        average = (double) sumOfBirthYears / countYears;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
