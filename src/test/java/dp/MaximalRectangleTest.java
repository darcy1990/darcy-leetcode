package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/28 2:50 下午
 */
public class MaximalRectangleTest {

    @Test
    public void maximalRectangle() {
        MaximalRectangle mr = new MaximalRectangle();
        Assert.assertEquals(mr.maximalRectangle(new char[][]{
                {'1','0','1','0','0'},
                {'1','1','1','1','1'},
                {'1','1','0','1','1'},
                {'1','0','0','1','0'}}), 5);
        Assert.assertEquals(mr.maximalRectangle(new char[][]{{}}), 0);
        Assert.assertEquals(mr.maximalRectangle(new char[][]{{'0'}}), 0);
        Assert.assertEquals(mr.maximalRectangle(new char[][]{{'1'}}), 1);
        Assert.assertEquals(mr.maximalRectangle(new char[][]{{'1', '1'}}), 2);

    }
}