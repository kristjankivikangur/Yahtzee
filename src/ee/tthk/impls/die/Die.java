package ee.tthk.impls.die;

import java.util.Random;

public class Die {
    int tulemus;
    public int Roll(){
        Random random = new Random();
        tulemus = random.nextInt(6) + 1;
        return tulemus;
    }

    public int getTulemus() {
        return tulemus;
    }
}
