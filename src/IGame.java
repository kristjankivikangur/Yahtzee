/**
 * Created by opilane on 25.09.2017.
 */
public interface IGame {
    void StartGame(int NumberOfPlayers);
    void ChangeRound();
    void ChangePlayer();
    void ChooseWinner(Player[] players);
}
