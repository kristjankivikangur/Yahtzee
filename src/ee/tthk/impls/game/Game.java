package ee.tthk.impls.game;

import ee.tthk.interfaces.*;
import ee.tthk.mocks.player.Player;
import ee.tthk.mocks.round.Round;

public class Game implements IGame {
    int CurrentPlayer = 0;
    int NrOfPlayers;
    Round round = new Round();
    IPlayer[] players;

    @Override
    public void StartGame(int NumberOfPlayers) {
        if (NumberOfPlayers < 1){
            NumberOfPlayers = 1;
        }
        NrOfPlayers = NumberOfPlayers;
        players=new Player[NumberOfPlayers];
        for (int i = 0;i < NumberOfPlayers;i++){
            players[i]=new Player();
            players[i].GetName();
        }
        for (int i = 13; i <= 13; i++){
            ChangeRound();
        }
        ChooseWinner();
    }

    @Override
    public void ChangeRound() {
        if (CurrentPlayer < NrOfPlayers) {
            ChangePlayer();
        } else {
            CurrentPlayer = 1;
            round.start(players[0]);
        }
    }

    @Override
    public void ChangePlayer() {
        round.start(players[CurrentPlayer]);
        CurrentPlayer+=1;
    }

    @Override
    public void ChooseWinner() {
        int highestScore = 0;
        String name = "";
        for (int i = 0; i < NrOfPlayers; i++){
            if (players[i].GetScoreBoard().GrandTotal() > highestScore){
                highestScore = players[i].GetScoreBoard().GrandTotal();
                name = players[i].GetName();
            }
        }
        System.out.println(name + " võitis!!");
    }
}
