package ee.tthk;

import ee.tthk.impls.game.Game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        game.StartGame(2);
        Map<String,Integer> players2 = new HashMap<String, Integer>();
        game.ChooseWinner(players2);
        System.out.println("Enter the number of players:");
        Scanner NrOfPlayers = new Scanner(System.in);

        if (NrOfPlayers.hasNextInt()){
            int result = Integer.parseInt(NrOfPlayers.next());
            if (result <= 0){
                System.out.println("ERROR: Yahtzee can be played by minimum 1 player(s).");
            }
            else{
                System.out.println("Number of players: " + result);
                game.StartGame(result);
            }
        }
        else {
            System.out.println("ERROR: Input must be a number");
        }
    }
}
