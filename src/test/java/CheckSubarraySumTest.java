import dp.prefix.CheckSubarraySum;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/30 11:51 上午
 */
public class CheckSubarraySumTest {

    @Test
    public void checkSubarraySum() {
        CheckSubarraySum css = new CheckSubarraySum();
        Assert.assertEquals(true, css.checkSubarraySum(new int[]{5, 0, 0, 0}, 3));
        Assert.assertEquals(true, css.checkSubarraySum(new int[]{1, 10000}, 1));
        Assert.assertEquals(true, css.checkSubarraySum(new int[]{2, 4, 3}, 6));
        Assert.assertEquals(true, css.checkSubarraySum(new int[]{23,2,4,6,6}, 7));
        Assert.assertEquals(true, css.checkSubarraySum(new int[]{23,2,4,6,7}, 6));
        Assert.assertEquals(true, css.checkSubarraySum(new int[]{23,2,6,4,7}, 6));
        Assert.assertEquals(false, css.checkSubarraySum(new int[]{23,2,6,4,7}, 13));
    }
}