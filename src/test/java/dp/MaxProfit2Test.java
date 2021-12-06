package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/24 5:56 下午
 */
public class MaxProfit2Test {

    @Test
    public void maxProfit() {
        MaxProfit2 mp = new MaxProfit2();
        int ans = mp.maxProfit(new int[] {2, 1, 3, 4});
        Assert.assertEquals(ans, 7);
    }
}