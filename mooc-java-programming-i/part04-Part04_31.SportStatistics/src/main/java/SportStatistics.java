
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        int numberOfGamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        games = readGameFile(file);
        
        for (Game game : games) {
            if (team.equals(game.getHomeTeam())
                    || team.equals(game.getVisitingTeam())) {
                numberOfGamesPlayed++;
                if (team.equals(game.getWinner())) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        
        System.out.println("Games: " + numberOfGamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> readGameFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        
        // Read file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                
                String[] contents = fileReader.nextLine().split(",");
                games.add(new Game(contents[0], contents[1], 
                    Integer.valueOf(contents[2]), Integer.valueOf(contents[3])));
            }            
        } catch (Exception e) {
            System.out.println("Failed to read the file " + file + ".");
        }  

        return games;
    }
}
