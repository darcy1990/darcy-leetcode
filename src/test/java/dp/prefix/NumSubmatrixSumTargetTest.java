package dp.prefix;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/30 5:01 下午
 */
public class NumSubmatrixSumTargetTest {

    @Test
    public void numSubmatrixSumTarget() {
        NumSubmatrixSumTarget n = new NumSubmatrixSumTarget();
        Assert.assertEquals(4, n.numSubmatrixSumTarget(new int[][]{{0,1,0},{1,1,1},{0,1,0}}, 0));
        Assert.assertEquals(5, n.numSubmatrixSumTarget(new int[][]{{1,-1},{-1,1}}, 0));
        Assert.assertEquals(0, n.numSubmatrixSumTarget(new int[][]{{94}}, 0));
    }
}