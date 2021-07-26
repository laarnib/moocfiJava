
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points; // Added by LB. Stores the exam points

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        
        // Added by LB
        // Add exam points to points ArrayList
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    // Added by LB
    public double averageOfGrades() {
        int numberOfGrades = 0, sum = 0;
        
        if (this.grades.isEmpty()) {
            return -1;
        }
        
        numberOfGrades = this.grades.size();
        for (Integer grade : grades) {
            sum += grade;
        }
        
        return (double)sum / numberOfGrades;
    }
    
    // Added by LB
    // Calculates the average of the exam points
    public double averageOfPoints() {
        int numberOfPoints = 0, sum = 0;
        
        if (this.points.isEmpty()) {
            return -1;
        }
        
        numberOfPoints = this.points.size();
        for (Integer point : points) {
            sum += point;
        }
        
        return (double)sum / numberOfPoints;
    }
           
}
