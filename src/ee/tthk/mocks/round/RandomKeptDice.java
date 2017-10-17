package ee.tthk.mocks.round;

import ee.tthk.impls.die.Die;
import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IRound;

import java.util.List;

/**
 * Created by opilane on 17.10.2017.
 */
public class RandomKeptDice implements IRound {
    @Override
    public void roll(List<IDie> dice) {

    }

    @Override
    public void keepDice(List<IDie> dice) {
        for (int i = 0; i <= 5; i++){
            Die die = new Die();
            die.Roll();
            dice.add(die);
        }
    }

    @Override
    public void start(IPlayer player) {

    }
}
