package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.interfaces.IScoreOption;

import java.util.List;

/**
 * Created by opilane on 04.10.2017.
 */
public class ScoreBoard implements IScoreBoard {
    @Override
    public List<IScoreOption> GetOptions(IDie[] Dice) {
        return null;
    }

    @Override
    public void UsersChoice(int line) {

    }

    @Override
    public int UpperScoreBoard() {
        return 0;
    }

    @Override
    public int LowerScoreBoard() {
        return 0;
    }

    @Override
    public int GrandTotal() {
        return 0;
    }
}
