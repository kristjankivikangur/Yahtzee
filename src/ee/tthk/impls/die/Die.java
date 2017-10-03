package ee.tthk.impls.die;

import ee.tthk.interfaces.IDie;

import java.util.Random;

public class Die implements IDie {
    int tulemus;
    public int Roll(){
        Random random = new Random();
        tulemus = random.nextInt(6) + 1;
        return tulemus;
    }

    @Override
    public int GetTulemus() {
        return tulemus;
    }

}
