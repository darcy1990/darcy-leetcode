package dp.mem;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/28 11:48 上午
 */
public class IntegerReplacementTest {

    @Test
    public void integerReplacement() {
        IntegerReplacement ir = new IntegerReplacement();
        Assert.assertEquals(3, ir.integerReplacement(2147483647));
        Assert.assertEquals(4, ir.integerReplacement(7));
        Assert.assertEquals(2, ir.integerReplacement(4));
    }
}