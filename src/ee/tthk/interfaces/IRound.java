package ee.tthk.interfaces;

/**
 * Created by opilane on 25.09.2017.
 */
public interface IRound {

    /**
     * Rolls a new value for each die in the given array.
     *
     * @param dice - täringute hulk
     */
    void roll(IDie[] dice);

    /**
     * Gives an option for the player to keep some of the dice.
     *
     * @param dice - täringute hulk, milliste väärtused säilitada
     */
    void keepDice(IDie[] dice);

    /**
     * Starts the round for a player.
     */
    void start(IPlayer player);
}
