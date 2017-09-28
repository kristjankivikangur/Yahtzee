package ee.tthk.interfaces;


public interface IPlayer {


    /**
     * Sets the player's name.
     *
     * @param name - name that the player wants.
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


    /**
     * Returns the player's total score from the scoreboard.
     *
     * @return - returns totalScore
     * */
    int GetScoreBoardTotal();
}
