import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/20 6:27 下午
 */
public class SubarraySumTest {

    @Test
    public void subarraySum() {
        SubarraySum ss = new SubarraySum();
        Assert.assertEquals(1, ss.subarraySum(new int[]{1}, 1));
        Assert.assertEquals(0, ss.subarraySum(new int[]{1}, 0));
        Assert.assertEquals(2, ss.subarraySum(new int[]{1, 1, 1}, 2));
        Assert.assertEquals(2, ss.subarraySum(new int[]{1, 2, 3}, 3));
        Assert.assertEquals(2, ss.subarraySum(new int[]{-19, -82, -70, -46, -29, 7, 15, -72, -7, 100, 303}, 100));
    }
}