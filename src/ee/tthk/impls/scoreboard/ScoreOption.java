package ee.tthk.impls.scoreboard;

import ee.tthk.interfaces.IScoreOption;

/**
 * Created by opilane on 03.10.2017.
 */
public class ScoreOption implements IScoreOption {
    int value;
    String name;
    public ScoreOption(String name,int value){
        this.name=name;
        this.value=value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
    }
}
