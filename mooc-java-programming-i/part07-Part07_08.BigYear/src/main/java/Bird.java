
/**
 *
 * @author lb123
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationCount;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }
    
    public Bird(String name) {
        this("Unknown", name);
        this.observationCount = 0;
    }    
    
    public Bird() {
        this("Unknown", "Unknown");
        this.observationCount = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    
    public void addOneToObservartion () {
        this.observationCount++;
    }
    
    public String getBirdName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getObservationCount() {
        return this.observationCount;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " 
               + this.observationCount + " observations";
    }

}
