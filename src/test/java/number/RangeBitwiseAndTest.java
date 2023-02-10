package number;

import org.junit.Test;

public class RangeBitwiseAndTest {

    @Test
    public void rangeBitwiseAnd() {
        RangeBitwiseAnd r = new RangeBitwiseAnd();
        System.out.println(r.rangeBitwiseAnd(0, 0));
        System.out.println(r.rangeBitwiseAnd(1, 2147483647));
    }
}