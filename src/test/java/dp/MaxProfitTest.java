package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/24 4:55 下午
 */
public class MaxProfitTest {

    @Test
    public void maxProfit() {
        MaxProfit mp = new MaxProfit();
        int ans = mp.maxProfit(new int[]{1, 2});
        Assert.assertEquals(ans, 1);
    }
}