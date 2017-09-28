package ee.tthk.mocks.die;
import ee.tthk.interfaces.IDie;

public class D6 implements IDie {
    public int Roll() {
        return 6;
    }

    public int GetTulemus() {
        return 6;
    }
}
