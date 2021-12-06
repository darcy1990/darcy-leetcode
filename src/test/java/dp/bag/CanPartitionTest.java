package dp.bag;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/3 5:33 下午
 */
public class CanPartitionTest {

    @Test
    public void canPartition() {
        CanPartition c = new CanPartition();
        Assert.assertEquals(true, c.canPartition(new int[]{1, 5, 11, 5}));
        Assert.assertEquals(false, c.canPartition(new int[]{1, 2, 3, 5}));
        Assert.assertEquals(false, c.canPartition(new int[]{1, 2, 5}));
    }
}