
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            
            // Print spaces
            if (size - i > 0) {
                printSpaces(size - i);
            }

            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int baseHeight = 2;
        int baseWidth = 3;
        
        // Print the triangle part of the tree
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i + (i - 1));
        }
        
        // Print base of the triangle
        for (int i = 1; i <= baseHeight; i++) {
            printSpaces(height - baseHeight);
            printStars(baseWidth);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
