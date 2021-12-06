package dp.bag;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/6 7:18 下午
 */
public class CombinationSum4Test {

    @Test
    public void combinationSum4() {
        CombinationSum4 c = new CombinationSum4();
        Assert.assertEquals(7, c.combinationSum4(new int[]{1,2,3}, 4));
        Assert.assertEquals(0, c.combinationSum4(new int[]{}, 3));
    }
}