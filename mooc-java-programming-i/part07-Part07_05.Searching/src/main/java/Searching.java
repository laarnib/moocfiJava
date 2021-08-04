
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = 0;
        for (Book book : books) {
            if (searchedId == book.getId()) {
                return index;
            }
            
            index++;
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int start = 0; 
        int end = books.size() - 1; 
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (searchedId == books.get(mid).getId()) {
                return mid;
            }
            
            if (searchedId < books.get(mid).getId()) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
            
            if (searchedId > books.get(mid).getId()) {
                start = mid + 1;
                mid = (start + end) / 2;
            }
        }
        
        return -1;
    }
}

