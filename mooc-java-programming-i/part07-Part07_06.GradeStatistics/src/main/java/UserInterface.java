/**
 *
 * @author lb123
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRegistry gradeRegistry;
    
    public UserInterface(Scanner scanner, GradeRegistry gradeRegistry) {
        this.scanner = scanner;
        this.gradeRegistry = gradeRegistry;
    }
    
    public void start() {
        readPoints();
        printAllPointsAverage();
        printPassingGradeAverage(); 
        printPassPercentage();
        printGradeDistribution();
    }
    
    private void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            
            if (points == -1) {
                break;
            }
            
            gradeRegistry.addPointsToRegistry(points);
        }        
    }
    
    private void printAllPointsAverage() {
        if (gradeRegistry.getAllPointsAverage() == 0.0) {
            System.out.println("Point average (all): -");
        } else {
            System.out.println("Point average (all): " + gradeRegistry.getAllPointsAverage());
        }
    }
    
    private void printPassingGradeAverage() {
        if (gradeRegistry.getPassingPointAverage() == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + gradeRegistry.getPassingPointAverage());
        }
    }
    
    private void printPassPercentage() {
        if (gradeRegistry.getGradeRegistrySize() == 0) {
            System.out.println("Pass percentage: -");
        } else {
            System.out.println("Pass percentage: " + gradeRegistry.getPassingPercentage());
        }
    }
    
    private void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(i);
            System.out.println("");
        }
    }
    
    private void printStars(int grade) {
        for (int i = 0; i < gradeRegistry.countNumberOfGrades(grade); i++) {
            System.out.print("*");
        }
    }
}
