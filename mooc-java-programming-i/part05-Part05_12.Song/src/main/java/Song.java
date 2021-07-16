
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        // Check if the two objects compared are located in the same location
        if (this == compared) {
            return true;
        }
        
        // Check if object compared is of type Song
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // Convert the compared object to a Song object
        Song songCompared = (Song) compared;
        
        // Compare the values of the two objects
        if (this.artist.equals(songCompared.artist) && 
            this.name.equals(songCompared.name) &&
            this.durationInSeconds == songCompared.durationInSeconds) {
            return true;
        }
        
        return false;
    }

}
