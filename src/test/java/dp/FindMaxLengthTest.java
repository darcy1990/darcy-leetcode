package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/29 6:22 下午
 */
public class FindMaxLengthTest {

    @Test
    public void findMaxLength() {
        FindMaxLength fml = new FindMaxLength();
        Assert.assertEquals(2, fml.findMaxLength(new int[]{0, 1, 0, 1, 1, 1, 0, 0, 1}));
    }
}