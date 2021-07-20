import java.util.ArrayList;

/**
 *
 * @author lb123
 */
public class Stack {
    private ArrayList<String> elements;
    
    public Stack() {
        this.elements = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.elements.size() == 0;
    }
    
    public void add(String value) {
        this.elements.add(value);
    }
    
    public ArrayList<String> values() {
        return this.elements;
    }
    
    public String take() {
        if (this.isEmpty()) {
            return "The stack is empty. Nothing to take.";
        } 
        return this.elements.remove(this.elements.size() - 1);
    }
}
