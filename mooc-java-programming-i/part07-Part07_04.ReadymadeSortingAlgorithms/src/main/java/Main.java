import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] words = {"hello", "apple", "alone", "beak", "caviar"};
        
        System.out.println("");
        System.out.println("Unsorted: " + Arrays.toString(array));
        sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        
        System.out.println("");
        System.out.println("Unsorted: " + Arrays.toString(words));
        sort(words);
        System.out.println("Sorted: " + Arrays.toString(words));
        
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(56);
        integers.add(-8);
        integers.add(14);
        integers.add(1);
        
        System.out.println("");
        System.out.println("Unsorted: " + integers);
        sortIntegers(integers);
        System.out.println("Sorted: " + integers);
        
        ArrayList<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("bacon");
        strings.add("bleak");
        strings.add("blame");
        strings.add("bored");
        
        System.out.println("");
        System.out.println("Unsorted: " + strings);
        sortStrings(strings);
        System.out.println("Sorted: " + strings);
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);    
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
