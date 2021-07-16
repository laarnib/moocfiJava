/**
 *
 * @author lb123
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
