
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeRegistry gradeRegistry= new GradeRegistry(50);
        UserInterface ui = new UserInterface(scanner, gradeRegistry);
        ui.start();
    }
}
