package ee.tthk.mocks.player;

import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IScoreBoard;

/**
 * Created by opilane on 04.10.2017.
 */
public class Player implements IPlayer {
    @Override
    public void SetName(String name) {

    }

    @Override
    public String GetName() {
        return null;
    }

    @Override
    public IScoreBoard GetScoreBoard() {
        return null;
    }
}
