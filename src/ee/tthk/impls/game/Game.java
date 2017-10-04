package ee.tthk.impls.game;

import com.sun.org.apache.xpath.internal.SourceTree;
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

    @Override
    public void StartGame(int NumberOfPlayers, Map<String,Integer> players) {
        for (int i = 0;i < NumberOfPlayers;i++){
            players.put(names.SetName(),0);
        }
        round.start(players);
    }

    @Override
    public void ChangeRound(Map<String,Integer> players) {
        if (CurrentRounds > 13){
            if (CurrentPlayer < NrOfPlayers){
                ChangePlayer(players);
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
    public void ChangePlayer(Map<String,Integer> players) {

        /* Example of how to get HashMap key aka String and how to get it's value aka integer
        Object key = players.keySet().toArray()[1];
        Object value = players.get(key);
        for (String key2 : players.keySet()){
            System.out.println(key2);
        }
        System.out.println("See on indeksil: 2 ja ta on " + value);
        */
        CurrentPlayer+=1;
        round.start(players);
    }

    @Override
    public void ChooseWinner(Map<String, Integer> players) {
        Map.Entry<String,Integer> maxEntry = null;
        for (Map.Entry<String,Integer> entry : players.entrySet()){
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry + " Võittis!!");
    }
}
