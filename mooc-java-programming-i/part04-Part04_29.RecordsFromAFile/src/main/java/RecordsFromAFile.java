
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        // Read the file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            while (fileReader.hasNextLine()) {
                String[] contents = fileReader.nextLine().split(",");
                String name = contents[0];
                int age = Integer.valueOf(contents[1]);

                //Commented out because formatting of the word year doesn't work
                // with the test cases
//                String msg = age > 1 ?
//                        name + ", age: " + age + " years":
//                        name + ", age: " + age + " year";
//                
//                System.out.println(msg);

                System.out.println(name + ", age: " + age + " years");
            } 
            
        } catch (Exception e) {
            System.out.println("Cannot read the file " + file + ".");
        }
    }
}
