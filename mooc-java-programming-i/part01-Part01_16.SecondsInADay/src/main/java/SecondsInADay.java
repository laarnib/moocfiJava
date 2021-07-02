
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hoursInADay = 24;
        final int minutesPerHour = 60;
        final int secondsPerMinute = 60;
        int days = 0;
        int seconds = 0;
        
        
        System.out.println("How many days would you like to convert to seconds?");
        days = Integer.valueOf(scanner.nextLine());
        
        // Convert days to seconds
        seconds = days * hoursInADay * minutesPerHour * secondsPerMinute;
        System.out.println(seconds);
    }
}
