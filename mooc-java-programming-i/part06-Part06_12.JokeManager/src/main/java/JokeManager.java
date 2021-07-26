/**
 *
 * @author lb123
 */
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        Random draw = new Random();
        int index = 0;

        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        index = draw.nextInt(this.jokes.size());
        return this.jokes.get(index);
    }
    
    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
