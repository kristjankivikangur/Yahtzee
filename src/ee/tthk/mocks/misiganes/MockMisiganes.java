package ee.tthk.mocks.misiganes;

import ee.tthk.interfaces.*;

public class MockMisiganes implements IMisiganes {
    @Override
    public void Hello() {

    }

    @Override
    public int Count(IDie[] dice) {
        return 90;
    }

    @Override
    public void Welcome(IPlayer participant) {

    }

    @Override
    public boolean Finished(IScoreBoard sheet) {
        return false;
    }

    @Override
    public void StateOfGame(IGame current) {

    }

    @Override
    public void RollNr(IRound current) {

    }
}
