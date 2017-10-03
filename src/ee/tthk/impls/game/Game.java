package ee.tthk.impls.game;

import ee.tthk.interfaces.*;
import ee.tthk.mocks.round.Round;

import java.util.*;

import org.apache.commons.lang3.ArrayUtils;
/**
 * Created by opilane on 03.10.2017.
 */
public class Game implements IGame {
    int CurrentRounds;
    int CurrentPlayer;
    int NrOfPlayers;
    Round round = new Round();
    Player names = new Player;
    Map<String,Integer> players = new HashMap<String, Integer>();

    @Override
    public void StartGame(int NumberOfPlayers) {
        /*players.put("Tomy",25);
        System.out.println(players);*/
        for (NumberOfPlayers){
            players.put(names.SetName,"0");
        }
    }

    @Override
    public void ChangeRound() {

    }

    @Override
    public void ChangePlayer() {
        if (CurrentPlayer < NrOfPlayers){
            CurrentPlayer+=1;
            round.start(players);
        }
        else {
            CurrentPlayer = 1;
            ChangeRound();
        }
    }

    @Override
    public void ChooseWinner(IPlayer[] players) {
        Map<String,Integer> players2 = new HashMap<String, Integer>();
        players2.put("Tomy",25);
        players2.put("Tomy2",67);
        System.out.println(Collections.max(players2) + " Võittis!!");
    }
}
