package ee.tthk.impls.round;

import ee.tthk.interfaces.IDie;

/**
 * Created by Rait on 03.10.2017.
 */
public class Round {

    void roll(IDie[] dice)
    {
        for (i=0;i<dice.length; i++)
        {
            dice[i].Roll();
        }
    }
}
