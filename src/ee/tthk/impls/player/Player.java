package ee.tthk.impls.player;

import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.mocks.scoreboard.ScoreEmpty;


public class Player implements IPlayer {

    private String PlayerName;
    private IScoreBoard playerScoreBoard;

    public Player(){
        playerScoreBoard = new ScoreEmpty();

    }

    @Override
    public void SetName(String name) {
        PlayerName = name;
    }

    @Override
    public String GetName() {
        return PlayerName;
    }

    @Override
    public IScoreBoard GetScoreBoard() {
        return playerScoreBoard;
    }
}
