package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/26 11:08 上午
 */
public class MaxProfitColdTest {

    @Test
    public void maxProfit() {
        MaxProfitCold mpc = new MaxProfitCold();
        int ans = mpc.maxProfit(new int[]{1,2,3,0,2});
        Assert.assertEquals(3, ans);
    }
}