package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/24 5:56 下午
 */
public class MaxProfit3Test {

    @Test
    public void maxProfit() {
        MaxProfit3 mp = new MaxProfit3();
        int ans = mp.maxProfit(new int[] {1}, 2);
        Assert.assertEquals(4, ans);
    }
}