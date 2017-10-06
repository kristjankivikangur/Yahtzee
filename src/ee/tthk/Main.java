package ee.tthk;


import ee.tthk.impls.round.Round;
import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IRound;
import ee.tthk.mocks.player.WinningPlayer;

import ee.tthk.impls.game.Game;

import java.util.*;


public class Main {
    public static void main(String[] args){
        IPlayer player = new WinningPlayer();
        IRound round = new Round();
        round.start(player);
    }
}
