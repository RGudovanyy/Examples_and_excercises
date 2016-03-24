package JUnitTest.JUnit;

public class FootballTeam implements Comparable<FootballTeam> {
    private int gamesWon;
    public FootballTeam(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesWon(){
        return gamesWon;
    }

    public int compareTo(FootballTeam otherTeam) {
        return gamesWon - otherTeam.getGamesWon();
    }
}
