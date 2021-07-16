/**
 *
 * @author lb123
 */
public class ArchiveCollection {
    private String identifier;
    private String name;
    
    public ArchiveCollection(String identifier, String name) {
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
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof ArchiveCollection)) {
            return false;
        }
        
        ArchiveCollection itemCompared = (ArchiveCollection) compared;
        
        if (this.identifier.equals(itemCompared.identifier)) {
            return true;
        }    
        
        return false;
    }
}
