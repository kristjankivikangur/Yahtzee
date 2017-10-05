package ee.tthk.impls.die;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by opilane on 05.10.2017.
 */
public class DieTest {
    Die die;
    @Before
    public void setUp() {
        die = new Die();
    }

    @Test
    public void roll() {
        die.Roll();
        assertTrue(die.GetTulemus() >= 1 && die.GetTulemus() <= 6);
    }

    @Test
    public void getTulemus() {
        assertEquals(die.Roll(), die.GetTulemus());
        assertNotEquals(die.GetTulemus(), die.Roll());
    }
}