/**
 *
 * @author lb123
 */

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            this.totalWeight += item.getWeight();
        } else {
            System.out.println("Item exceeds maximum weight. Item not added.");
        }
    }
    
    @Override
    public String toString() {
        String message = "";
        int itemCount = items.size();
        
        if (itemCount > 1) {
            message = itemCount + " items (";
        } else if (itemCount == 1) {
            message = itemCount + " item (";
        } else {
            message = "no items (";
        }
        
        return message + this.totalWeight + " kg)";
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }    
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item : this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
 }
