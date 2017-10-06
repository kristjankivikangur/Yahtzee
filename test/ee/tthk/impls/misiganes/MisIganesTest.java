package ee.tthk.impls.misiganes;

import ee.tthk.interfaces.IDie;
import ee.tthk.mocks.die.D5;
import ee.tthk.mocks.scoreboard.ScoreUpperLowerDoneHigh;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class MisIganesTest {
    private MisIganes testobject;
    @Before
    void setUp() {
        testobject=new MisIganes();
    }

    @Test
    void hello() {
    }

    @Test
    void count() {
        IDie[] viied=new D5[]{new D5(),new D5(),new D5(),new D5(),new D5()};
        assertEquals(25,testobject.Count(viied));
    }

    @Test
    void welcome() {
    }

    @Test
    void finished() {
        assertTrue(testobject.Finished(new ScoreUpperLowerDoneHigh()));
    }

    @Test
    void stateOfGame() {
    }

    @Test
    void rollNr() {
    }

}