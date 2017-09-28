package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.interfaces.IScoreOption;

import java.util.List;

public class ScoreUpperLowerDoneHigh implements IScoreBoard{

    @Override
    public List<IScoreOption> GetOptions(IDie[] Dice) {
        return null;
    }

    @Override
    public void UsersChoice(int line) {

    }

    @Override
    public int UpperScoreBoard() {
        return 5+10+15+20+25+30+35;
    }

    @Override
    public int LowerScoreBoard() {
        return 18+24+25+30+40+50+30;
    }

    @Override
    public int GrandTotal() {
        return 357;
    }
}
