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
        // All the players are created
        for (int i = 0;i < NumberOfPlayers;i++){
            players[i]=new Player();
            players[i].GetName();
        }
        // The round gets changed until the 13th round
        for (int i = 1; i <= 13; i++){
            ChangeRound();
        }
        ChooseWinner();
    }

    @Override
    public void ChangeRound() {
        // Until all the player have not played their current round the players get changed
        while (CurrentPlayer < NrOfPlayers) {
            ChangePlayer();
        }
        // Changing to the first player
        CurrentPlayer = 1;
        round.start(players[0]);
    }

    @Override
    public void ChangePlayer() {
        // Starting the round with the current player
        round.start(players[CurrentPlayer]);
        // Changing the player
        CurrentPlayer+=1;
    }

    @Override
    public void ChooseWinner() {
        int highestScore = 0;
        String name = "";
        // Checking every player that who has the highest score
        for (int i = 0; i < NrOfPlayers; i++){
            if (players[i].GetScoreBoard().GrandTotal() > highestScore){
                highestScore = players[i].GetScoreBoard().GrandTotal();
                name = players[i].GetName();
            }
        }
        // Giving out the winner
        System.out.println(name + " võitis!!");
    }
}
