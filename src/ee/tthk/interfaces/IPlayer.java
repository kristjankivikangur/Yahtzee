package ee.tthk.interfaces;


public interface IPlayer {


    /**
     * Returns the player's name.
     *
     * */
    void SetName(String name);


    /**
     * Returns the player's name.
     * */
    String GetName();


    /**
     * Returns the player's scoreboard for data checking etc.
     *
     * @return - returns the scoreboard
     * */
    IScoreBoard GetScoreBoard();

}
