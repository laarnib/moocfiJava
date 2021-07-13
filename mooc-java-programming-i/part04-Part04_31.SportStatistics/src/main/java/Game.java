/**
 *
 * @author lb123
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamScore;
    private int visitingTeamScore;
    
    public Game(String homeTeam, String visitingTeam, int homeScore, int visitingScore) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamScore = homeScore;
        this.visitingTeamScore = visitingScore;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getVisitingTeam() {
        return visitingTeam;
    }
    
    public int getHomeTeamScore() {
        return homeTeamScore;
    }
    
    public int getVisitingTeamScore() {
        return visitingTeamScore;
    }
    
    public String getWinner() {
        if (homeTeamScore > visitingTeamScore) {
            return homeTeam;
        }
        
        return visitingTeam;
    }
}
