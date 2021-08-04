
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String textFile = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(textFile))) {
            UserInterface ui = new UserInterface(fileReader, scanner);
            ui.start();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not found.");
        }
        
        scanner.close();
    }
}
