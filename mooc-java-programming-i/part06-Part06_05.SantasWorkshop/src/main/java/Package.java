/**
 *
 * @author lb123
 */

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> listOfGifts;
    
    public Package() {
        this.listOfGifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.listOfGifts.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Gift gift : listOfGifts) {
            totalWeight += gift.getWeight();
        }
        
        return totalWeight;
    }    
}
