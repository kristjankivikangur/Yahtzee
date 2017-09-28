package ee.tthk.interfaces;

/**
 * Created by opilane on 25.09.2017.
 */
public interface IGame {
    /**
     * Asks the player for the number of players and then calls out the Player class for it to give them names
     * @param NumberOfPlayers - The number of players
     */
    void StartGame(int NumberOfPlayers);

    /**
     * Changes the round if it has ended and all the players have played their current round
     */
    void ChangeRound();

    /**
     * Changes the player if the earlier player has ended his/her's round
     */
    void ChangePlayer();

    /**
     * Chooses the winner of the game after all the rounds have been played
     * @param players - An array of player
     */
    void ChooseWinner(IPlayer[] players);
}
