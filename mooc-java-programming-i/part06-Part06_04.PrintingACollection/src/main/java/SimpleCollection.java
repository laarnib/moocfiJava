
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        String listItems = "";
        int elementsCount = this.elements.size();
        
        if (elementsCount == 0) {
            return "The collection " + this.name + " is empty.";
        } 
        
        for (String element : this.elements) {
            listItems = listItems + "\n" + element;
        }
        
        if (elementsCount == 1) {
            return "The collection " + this.name + " has " + elementsCount + 
                    " element:" + listItems;
        }
        
        return "The collection " + this.name + " has " + elementsCount + 
                " elements:" + listItems;
    }    
}
