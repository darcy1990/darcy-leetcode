package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/31 4:41 下午
 */
public class AtMostNGivenDigitSetTest {

    @Test
    public void atMostNGivenDigitSet() {
        AtMostNGivenDigitSet a = new AtMostNGivenDigitSet();
        Assert.assertEquals(20, a.atMostNGivenDigitSet(new String[]{"1","3","5","7"}, 100));
    }
}