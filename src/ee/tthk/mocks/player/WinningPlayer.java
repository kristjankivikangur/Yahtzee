package ee.tthk.mocks.player;


import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IScoreBoard;

public class WinningPlayer implements IPlayer{

    private String PlayerName;
    private IScoreBoard playerScoreBoard;

    public WinningPlayer(){
        playerScoreBoard = new winningScoreBoard();

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

    @Override
    public int GetScoreBoardTotal() {
        return 0;
    }
}
