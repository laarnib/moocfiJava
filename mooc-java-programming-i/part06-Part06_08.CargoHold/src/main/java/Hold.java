/**
 *
 * @author lb123
 */

import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int totalWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int suitcaseWeight = suitcase.totalWeight();
        if (this.totalWeight + suitcaseWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
            
            this.totalWeight += suitcaseWeight;
        }
    }
    
    @Override
    public String toString() {
        String message = "";
        int totalSuitcases = this.suitcases.size();
        
        if (totalSuitcases == 0) {
            message = "No suitcases on hold (";
        } else if (totalSuitcases == 1) {
            message = totalSuitcases + " suitcase (";
        } else {
            message = totalSuitcases + " suitcases (";
        }
        
        return message + this.totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }    
}
