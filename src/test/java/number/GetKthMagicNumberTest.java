package number;

import org.junit.Test;

public class GetKthMagicNumberTest {

    @Test
    public void getKthMagicNumber() {
        GetKthMagicNumber g = new GetKthMagicNumber();
        long t1 = System.currentTimeMillis();
        System.out.println(g.getKthMagicNumber(643));
        long t2 = System.currentTimeMillis();
        System.out.println((t2 - t1) / 1000);
    }
}