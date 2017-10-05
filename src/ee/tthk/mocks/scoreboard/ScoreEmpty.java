package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.interfaces.IScoreOption;

import java.util.ArrayList;
import java.util.List;

public class ScoreEmpty implements IScoreBoard {

    List<IScoreOption> options;
    @Override
    public List<IScoreOption> GetOptions(IDie[] Dice) {
        options = new ArrayList<>();
        options.add(new ScoreOptionConstructor("ones",-1));
        options.add(new ScoreOptionConstructor("twos",-1));
        options.add(new ScoreOptionConstructor("threes",-1));
        options.add(new ScoreOptionConstructor("fours",-1));
        options.add(new ScoreOptionConstructor("fives",-1));
        options.add(new ScoreOptionConstructor("sixes",-1));
        options.add(new ScoreOptionConstructor("Three of a kind",-1));
        options.add(new ScoreOptionConstructor("Four of a kind",-1));
        options.add(new ScoreOptionConstructor("Full House",-1));
        options.add(new ScoreOptionConstructor("Small straight",-1));
        options.add(new ScoreOptionConstructor("Large straight",-1));
        options.add(new ScoreOptionConstructor("Chance",-1));
        options.add(new ScoreOptionConstructor("Yahtzee",-1));
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