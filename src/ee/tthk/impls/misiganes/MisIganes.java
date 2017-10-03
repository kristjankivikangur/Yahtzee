package ee.tthk.impls.misiganes;

import ee.tthk.interfaces.*;

public class MisIganes implements IMisiganes {
    @Override
    public void Hello() {

    }

    @Override
    public int Count(IDie[] dice) {
        int sum=0;
        for (IDie die:dice
             ) {
            sum+=die.GetTulemus();
        }
        return sum;
    }

    @Override
    public void Welcome(IPlayer participant) {

    }

    @Override
    public boolean Finished(IScoreBoard sheet) {
        return sheet.GrandTotal()!=-1;
    }

    @Override
    public void StateOfGame(IGame current) {

    }

    @Override
    public void RollNr(IRound current) {

    }
}
