package ee.tthk.impls.game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game;
    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void startGame() {
        game.StartGame(-1);
        assertTrue(game.NrOfPlayers > 0);
    }

    @Test
    public void changeRound() {
    }

    @Test
    public void changePlayer() {
    }

    @Test
    public void chooseWinner() {
    }
}