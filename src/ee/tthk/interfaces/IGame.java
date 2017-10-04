package ee.tthk.interfaces;

import java.util.Map;

/**
 * Created by opilane on 25.09.2017.
 */
public interface IGame {
    /**
     * Asks the player for the number of players and then calls out the Player class for it to give them names
     * @param NumberOfPlayers - The number of players
     */
    void StartGame(int NumberOfPlayers,Map<String,Integer> players);

    /**
     * Changes the round if it has ended and all the players have played their current round
     */
    void ChangeRound(Map<String,Integer> players);

    /**
     * Changes the player if the earlier player has ended his/her's round
     */
    void ChangePlayer(Map<String,Integer> players);

    /**
     * Chooses the winner of the game after all the rounds have been played
     * @param players - An array of player
     */
    void ChooseWinner(Map<String, Integer> players);
}
