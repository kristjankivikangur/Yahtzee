package ee.tthk;

import ee.tthk.impls.round.Round;
import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IRound;
import ee.tthk.mocks.player.WinningPlayer;

public class Main {
    public static void main(String[] args){
        IPlayer player = new WinningPlayer();
        IRound round = new Round();
        round.start(player);
    }
}
