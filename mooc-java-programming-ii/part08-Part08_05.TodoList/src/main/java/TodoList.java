/**
 *
 * @author lb123
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> taskList;
    
    public TodoList() {
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task) {
        taskList.add(task);
    }
    
    public void print() {
        int i = 0;
        for (String task : taskList) {
            System.out.println((i+1) + ": " + task);
            i++;
        }
    }
    
    public void remove(int number) {
        taskList.remove(number - 1);
    }
}
