package dp.num;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/30 5:25 下午
 */
public class KnightDialerTest {

    @Test
    public void knightDialer() {
        KnightDialer k = new KnightDialer();
        Assert.assertEquals(10, k.knightDialer(1));
        Assert.assertEquals(20, k.knightDialer(2));
        Assert.assertEquals(46, k.knightDialer(3));
    }
}