
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String thePassword = "Caput Draconis";
        
        System.out.println("Password?");
        String passwordInput = scan.nextLine();
        
        if (passwordInput.equals(thePassword)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }        
    }
}
