import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/11 9:11 下午
 */
public class Candy2Test {

    @Test
    public void candy() {
        Candy2 c = new Candy2();
        Assert.assertEquals(1, c.candy(new int[]{1}));
        Assert.assertEquals(5, c.candy(new int[]{1, 0, 2}));
        Assert.assertEquals(4, c.candy(new int[]{1, 2, 2}));
        Assert.assertEquals(6, c.candy(new int[]{1, 2, 2, 1}));
        Assert.assertEquals(7, c.candy(new int[]{1, 2, 2, 2, 1}));
        Assert.assertEquals(47, c.candy(new int[]{1,2,3,5,4,3,2,1,4,3,2,1,3,2,1,1,2,3,4}));
        Assert.assertEquals(11, c.candy(new int[]{1,3,4,5,2}));
    }
}