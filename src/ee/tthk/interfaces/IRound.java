package ee.tthk.interfaces;

import java.util.List;

/**
 * Created by opilane on 25.09.2017.
 */
public interface IRound {

    /**
     * Rolls a new value for each die in the given array.
     *
     * @param dice - täringute hulk
     */

    void roll(List<IDie> dice);

    /**
     * Gives an option for the player to keep some of the dice.
     *
     * @param dice - täringute hulk, milliste väärtused säilitada
     */
    void keepDice(List<IDie> dice);

    /**
     * Starts the round for a player.
     */
    void start(IPlayer player);
}
