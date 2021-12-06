import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/9 6:12 下午
 */
public class CandyTest {

    @Test
    public void candy() {
        Candy c = new Candy();
        Assert.assertEquals(1, c.candy(new int[]{1}));
        Assert.assertEquals(5, c.candy(new int[]{1, 0, 2}));
        Assert.assertEquals(4, c.candy(new int[]{1, 2, 2}));
        Assert.assertEquals(6, c.candy(new int[]{1, 2, 2, 1}));
        Assert.assertEquals(7, c.candy(new int[]{1, 2, 2, 2, 1}));
        Assert.assertEquals(47, c.candy(new int[]{1,2,3,5,4,3,2,1,4,3,2,1,3,2,1,1,2,3,4}));
    }
}