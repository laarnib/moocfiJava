
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> words = new ArrayList<>();
        
        words.add("First");
        words.add("Second");
        words.add("Third");
        
        removeLast(words);
        
        for (String word : words) {
            System.out.println(word);
        }
        
    }
    
    public static void removeLast(ArrayList<String> strings) {
        int size = strings.size();
        if (size > 0) {
            strings.remove(size - 1);
        }
    }

}
