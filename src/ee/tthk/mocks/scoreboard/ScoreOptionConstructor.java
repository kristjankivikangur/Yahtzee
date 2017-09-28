package ee.tthk.mocks.scoreboard;

import ee.tthk.interfaces.IScoreOption;

/**
 * Created by opilane on 28.09.2017.
 */
public class ScoreOptionConstructor implements IScoreOption {

    String name;
    int score;
    public ScoreOptionConstructor(String name,int score){
        this.name=name;
        this.score=score;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return score;
    }
}
