import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> myBookCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine()); 
            
            myBookCollection.add(new Book(title, pages, publicationYear));
        }
        
        System.out.println("");
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        
        for (Book book : myBookCollection) {
            if (input.toLowerCase().equals("everything")) {
                System.out.println(book);
            } else if (input.toLowerCase().equals("name")) {
                System.out.println(book.getBookTitle());
            }
        }            
    }
}
