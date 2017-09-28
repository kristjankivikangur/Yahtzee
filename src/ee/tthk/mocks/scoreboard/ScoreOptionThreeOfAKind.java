package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IScoreOption;

/**
 * Created by opilane on 28.09.2017.
 */
public class ScoreOptionThreeOfAKind implements IScoreOption {

    @Override
    public String getName() {
        return "Three of a kind";
    }

    @Override
    public int getValue() {
        return 18;
    }
}
