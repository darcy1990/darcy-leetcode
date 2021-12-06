import dp.bag.CoinChange;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/21 2:36 下午
 */
public class CoinChangeTest {

    @Test
    public void coinChange() {
        CoinChange cc = new CoinChange();
        Assert.assertEquals(3, cc.coinChange(new int[]{1, 2, 5}, 11));
        Assert.assertEquals(-1, cc.coinChange(new int[]{2}, 3));
        Assert.assertEquals(0, cc.coinChange(new int[]{1}, 0));
        Assert.assertEquals(1, cc.coinChange(new int[]{1}, 1));
        Assert.assertEquals(2, cc.coinChange(new int[]{1}, 2));
    }
}