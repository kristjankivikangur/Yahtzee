package ee.tthk;

import ee.tthk.impls.game.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Enter the number of players:");
        Scanner NrOfPlayers = new Scanner(System.in);

        if (NrOfPlayers.hasNextInt()){
            int result = Integer.parseInt(NrOfPlayers.next());
            if (result <= 0){
                System.out.println("ERROR: Yahtzee can be played by minimum 1 player(s).");
            }
            else{
                System.out.println("Number of players: " + result);
                Game game = new Game();
                game.StartGame(result);
            }
        }
        else {
            System.out.println("Input must be an int");
        }
    }
}
