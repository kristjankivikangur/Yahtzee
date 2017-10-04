package ee.tthk.impls.game;

import ee.tthk.interfaces.*;
import ee.tthk.mocks.player.Player;
import ee.tthk.mocks.round.Round;

import java.util.*;
/**
 * Created by opilane on 03.10.2017.
 */
public class Game implements IGame {
    int CurrentRounds;
    int CurrentPlayer;
    int NrOfPlayers;
    Round round = new Round();
    Player names = new Player();
    Map<String,Integer> players = new HashMap<String, Integer>();

    @Override
    public void StartGame(int NumberOfPlayers) {
        for (int i = 0;i < NumberOfPlayers;i++){
            players.put(names.SetName(),0);
        }
        round.start(players);
    }

    @Override
    public void ChangeRound() {
        if (CurrentRounds > 13){
            if (CurrentPlayer < NrOfPlayers){
                ChangePlayer();
            }
            else {
                CurrentPlayer = 1;
                round.start(players);
            }
        }
        else {
            ChooseWinner(players);
        }
    }

    @Override
    public void ChangePlayer() {
        CurrentPlayer+=1;
        round.start(players);
    }

    @Override
    public void ChooseWinner(Map players) {
        Map<String,Integer> players2 = new HashMap<String, Integer>();
        players2.put("Tomy",25);
        players2.put("Tomy2",67);
        Map.Entry<String,Integer> maxEntry = null;
        for (Map.Entry<String,Integer> entry : players2.entrySet()){
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry + " Võittis!!");
    }
}
