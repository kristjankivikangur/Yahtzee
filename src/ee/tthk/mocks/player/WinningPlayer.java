package ee.tthk.mocks.player;


import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.mocks.scoreboard.ScoreUpperLowerDoneHigh;

public class WinningPlayer implements IPlayer{

    private String PlayerName;
    private IScoreBoard playerScoreBoard;
    private String name;

    public WinningPlayer(){
        playerScoreBoard = new ScoreUpperLowerDoneHigh();

    }


    @Override
    public void SetName(String name) {
        PlayerName=name;
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
