
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        // Check if the two objects are in the same location
        if (this == compared) {
            return true;
        }
        
        // Check if Object compared is of type Person
        if (!(compared instanceof Person)) {
            return false;
        }
        
        // Convert the Object compared to a Person 
        Person personCompared = (Person)compared;
        
        // Compare the values of the two objects
        if (this.name.equals(personCompared.name) && 
            this.birthday.equals(personCompared.birthday) &&
            this.height == personCompared.height && 
            this.weight == personCompared.weight) {
            return true;
        }
        
        return false;
    }
}
