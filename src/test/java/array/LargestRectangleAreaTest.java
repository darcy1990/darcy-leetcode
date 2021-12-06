package array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/12/3 6:28 下午
 */
public class LargestRectangleAreaTest {

    @Test
    public void largestRectangleArea() {
        LargestRectangleArea l = new LargestRectangleArea();
        Assert.assertEquals(2, l.largestRectangleArea(new int[]{2}));
        Assert.assertEquals(10, l.largestRectangleArea(new int[]{2,1,5,6,2,3}));
        Assert.assertEquals(4, l.largestRectangleArea(new int[]{2,4}));
        Assert.assertEquals(12, l.largestRectangleArea(new int[]{5,5,1,7,1,1,5,2,7,6}));
    }
}