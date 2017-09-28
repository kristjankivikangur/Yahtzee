package ee.tthk.interfaces;


public interface IPlayer {


    /**
     * Sets the player's name.
     *
     * @param name - name that the player wants.
     * */
    void AddName(String name);


    /**
     * Sets a scoreboard for the player.
     *
     * @param scoreboard - scoreboard that the player will be set.
     * */
    void SetScoreBoard(IScoreBoard scoreboard);


    /**
     * Returns the player's scoreboard for data checking etc.
     *
     * @return - returns the scoreboard
     * */
    void GetScoreBoard();


    /**
     * Returns the player's total score from the scoreboard.
     *
     * @return - returns totalScore
     * */
    int GetScoreBoardTotal();
}
