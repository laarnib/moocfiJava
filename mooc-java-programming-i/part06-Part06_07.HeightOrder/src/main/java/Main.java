import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your class here
        
        Scanner scanner = new Scanner(System.in);
        Room conference = new Room();
        
        while(true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.print("Height: ");
            int height = Integer.valueOf(scanner.nextLine());
            conference.add(new Person(name,height));
        }
        
        System.out.println("");
        for (Person person: conference.getPersons()) {
            System.out.println(person);
        }
        
        System.out.println("The shortest person in the room is : " + conference.shortest());
        
        while (!conference.isEmpty()) {
            System.out.println(conference.take());
        }
    }
}
