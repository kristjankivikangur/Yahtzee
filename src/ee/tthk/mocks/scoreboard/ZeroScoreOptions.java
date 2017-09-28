package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.interfaces.IScoreOption;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opilane on 28.09.2017.
 */
public class ZeroScoreOptions implements IScoreBoard
{
    List<IScoreOption> options;
    @Override
    public List<IScoreOption> GetOptions(IDie[] Dice) {
        options = new ArrayList<>();
        options.add(new ScoreOptionConstructor("twos",0));
        options.add(new ScoreOptionConstructor("threes",0));
        options.add(new ScoreOptionConstructor("fours",0));
        options.add(new ScoreOptionConstructor("Four of a kind",0));
        options.add(new ScoreOptionConstructor("Full House",0));
        return options;
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
        return -1;
    }

    @Override
    public int GrandTotal() {
        return -1;
    }
}
