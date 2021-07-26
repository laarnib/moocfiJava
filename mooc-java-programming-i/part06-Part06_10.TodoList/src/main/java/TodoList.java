/**
 *
 * @author lb123
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        if (this.list.isEmpty()) {
            System.out.println("There is no task in the list.");
        } else {    
            for (String task : list) {
                System.out.println((this.list.indexOf(task) + 1) + ": " + task);
            }
        }
    }
    
    public void remove(int number) {
        
        try {
            if (this.list.isEmpty()) {
                System.out.println("No task in the list.");
            } else {
                this.list.remove(number - 1);            
            }
        } catch (Exception e) {
            System.out.println("Invalid number. No task is removed.");
        }
    }
}
