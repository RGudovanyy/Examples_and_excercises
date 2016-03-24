package JUnitTest.JUnit;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

    public Object[] nbOfGamesWon(){
        return $(0,1,2);
    }


    @Test
    @Parameters(method = "nbOfGamesWon")
    public void constructorShouldSetGamesWow(int nbOfGamesWon){
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        Assert.assertEquals(nbOfGamesWon + " games passed to constructor, but " + team.getGamesWon() + " were returned", nbOfGamesWon, team.getGamesWon());
    }

    public Object[] illegalNbOfGamesWon() {
        return $(-10, -1);
    }
    @Ignore
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "illegalNbOfGamesWon")
    public void constructorShouldThrowExceptionForIllegalGamesNb(
            int illegalNbOfGames) {
        new FootballTeam(illegalNbOfGames);
    }

    private static final int ANY_NUMBER = 123;

    @Test
    public void shouldBePossibleToCompareTeams(){
        FootballTeam team = new FootballTeam(ANY_NUMBER);
        Assert.assertTrue("FootballTeam should implement Comparable", team instanceof Comparable);
    }

    @Test
    public void teamsWithMoreMatchesWonShouldBeGreater(){
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        Assert.assertTrue(team_3.compareTo(team_2) > 0);
    }

    @Test
    public void teamsWithLessMatchesWonShouldBeLesser() {
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        Assert.assertTrue(team_2.compareTo(team_3) < 0);
    }

    @Test
    public void teamsWithSameNumberOfMatchesWonShouldBeEqual(){
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(2);
        Assert.assertTrue("both teams have won the same number of games: "
                + teamA.getGamesWon() + " vs. " + teamB.getGamesWon()
                + " and should be ranked equal", teamA.compareTo(teamB) == 0);
    }

}
