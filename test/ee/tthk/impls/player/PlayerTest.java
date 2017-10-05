package ee.tthk.impls.player;

import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.mocks.scoreboard.ScoreEmpty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player testPlayer;

    @Before
    public void setUp() throws Exception {
        testPlayer = new Player();
    }

    @Test
    public void setName() throws Exception {
        testPlayer.SetName("Mark");
        Assert.assertEquals("Mark",testPlayer.GetName());
    }

    @Test
    public void getName() throws Exception {
        testPlayer.SetName("Karl");
        Assert.assertEquals("Karl",testPlayer.GetName());
    }

    @Test
    public void getScoreBoard() throws Exception {
        IScoreBoard testSb = testPlayer.GetScoreBoard();

        Assert.assertEquals(testSb,testPlayer.GetScoreBoard());
    }

}