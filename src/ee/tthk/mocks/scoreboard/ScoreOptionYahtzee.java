package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IScoreOption;

/**
 * Created by opilane on 28.09.2017.
 */
public class ScoreOptionYahtzee implements IScoreOption {

    @Override
    public String getName() {
        return "Yahtzee";
    }

    @Override
    public int getValue() {
        return 50;
    }
}
