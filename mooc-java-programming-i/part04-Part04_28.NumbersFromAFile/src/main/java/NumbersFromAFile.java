
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        // Read the file and find the numbers that are inside the given range
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            int count = 0;
            
            while(fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }  
            
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Cannot read the file " + file);
            System.out.println("Exiting...");
        }
    }
}
