
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character_name = "";
        String character_job = "";
        
        System.out.println("I will tell you a story, but I need some information "
                + "first.");
        System.out.println("What is the main character called?");
        character_name = scanner.nextLine();
        System.out.println("What is their job?");
        character_job = scanner.nextLine();
        
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + character_name
                           + ", who was " + character_job + ".");
        System.out.println("On the way to work, " + character_name 
                           + " reflected on life.");
        System.out.println("Perhaps " + character_name + " will not be "
                           + character_job + " forever.");
    }
}
