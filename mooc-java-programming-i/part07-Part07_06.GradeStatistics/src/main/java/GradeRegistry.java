
/**
 *
 * @author lb123
 */
import java.util.ArrayList;

public class GradeRegistry {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private int passingPoints;
    
    public GradeRegistry(int passingPoints) {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.passingPoints = passingPoints;
    }
    
    public GradeRegistry() {
        this(50);
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPointsToRegistry(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
            addConvertedPointsToGradeToRegistry(point);
        }
    }   
    
    public double getAllPointsAverage() {
        int sum = 0;
        
        if (points.size() == 0) {
            return 0;
        }
        
        for (Integer point : points) {
            sum += point;
        }
        
        return sum / (points.size() * 1.0);
    }
    
    public double getPassingPointAverage() {
        int sum = 0;
        int counter = 0;
        
        for (Integer point : points) {
            if (point >= passingPoints) {
                sum += point;
                counter++;
            }
        }
        
        if (counter == 0) {
            return 0.0;
        } else {
            return sum / counter * 1.0;
        }        
    }
    
    public double getPassingPercentage() {
        int passedCounter = 0;
        int numberOfParticipants = points.size();
        for (Integer point : points) {
            if (point >= passingPoints) {
                passedCounter++;
            }
        }
        
        if (numberOfParticipants == 0) {
            return 0.0;
        } else {
            return 100 * (passedCounter / (numberOfParticipants * 1.0));
        }
    }
    
    public int getGradeRegistrySize() {
        return points.size();
    }
    
    public int pointsToGrades(int points) {
        int grade = 0;
        
        if (points < passingPoints) {
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
    
    public void addConvertedPointsToGradeToRegistry(int point) {
            grades.add(pointsToGrades(point));       
    }
    
    public int countNumberOfGrades(int grade) {
        int count = 0;
        
        for (Integer g : grades) {
            if (g == grade) {
                count++;
            }
        }
        
        return count;
    }
}
