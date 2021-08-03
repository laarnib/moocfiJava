
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
        System.out.println("Index of smallest from: " + indexOfSmallestFrom(array, 0));
        System.out.println("Index of smallest from: " + indexOfSmallestFrom(array, 2));
        System.out.println("Index of smallest from: " + indexOfSmallestFrom(array, 4));

//        swap(array, 0, 2);
//        System.out.println(Arrays.toString(array));
        sort(array);
        
    }
    
    public static int smallest(int[] numbers) {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] numbers) {
        int smallest = 0;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[smallest] > numbers[i]) {
                smallest = i;
            }
        }
        
        return smallest;
        
    }
        
    public static int indexOfSmallestFrom(int[] numbers, int startIndex) {
        int smallest = startIndex;
        
        for (int i = startIndex + 1; i < numbers.length; i++) {
            if (numbers[smallest] > numbers[i]) {
                smallest = i;
            }
        }
        
        return smallest;
    }
    
    public static void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;        
    }
    
    public static void sort(int[] numbers) {
        int smallestNumberFromIndex = 0;
        int stepCount = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers));
            smallestNumberFromIndex = indexOfSmallestFrom(numbers, i);
            MainProgram.swap(numbers, i, smallestNumberFromIndex);
        }
    }
}
