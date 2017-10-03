package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.interfaces.IScoreOption;

import java.util.List;

/**
 * Created by opilane on 28.09.2017.
 */
public class ScoreLowerDoneHigh implements IScoreBoard{
    @Override
    public List<IScoreOption> GetOptions(IDie[] Dice) {
        return null;
    }

    @Override
    public void UsersChoice(int line) {

    }

    @Override
    public int UpperScoreBoard() {
        return -1;
    }

    @Override
    public int LowerScoreBoard() {
        return 30+30+25+30+40+50+30;
    }

    @Override
    public int GrandTotal() {
        return -1;
    }
}
