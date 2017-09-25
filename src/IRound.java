/**
 * Created by opilane on 25.09.2017.
 */
public interface IRound {

    /**
     * Rolls a new value for each die in the given array.
     *
     * @param dice
     */
    public void roll(IDie[] dice);

    /**
     * Gives an option for the player to keep some of the dice.
     *
     * @param dice
     */
    public void keepDice(IDie[] dice);

    /**
     * Starts the round for a player.
     */
    public void start(IPlayer player);
}
