package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/28 4:47 下午
 */
public class MinStepsTest {

    @Test
    public void minSteps() {
        MinSteps ms = new MinSteps();
        Assert.assertEquals(3, ms.minSteps(3));
    }
}