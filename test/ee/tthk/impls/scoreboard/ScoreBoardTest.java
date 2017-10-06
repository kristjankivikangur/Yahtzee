package ee.tthk.impls.scoreboard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreBoardTest {

    ScoreBoard scoreBoard;

    @Before
    public void setUp() throws Exception
    {
        scoreBoard = new ScoreBoard();
    }

    @Test
    public void getOptions()
    {
    }

    @Test
    public void usersChoice()
    {

    }

    @Test
    public void upperScoreBoard()
    {
        scoreBoard.UpperScoreBoard();

    }

    @Test
    public void lowerScoreBoard()
    {
        scoreBoard.LowerScoreBoard();
    }

    @Test
    public void grandTotal()
    {
        scoreBoard.GrandTotal();
    }
}