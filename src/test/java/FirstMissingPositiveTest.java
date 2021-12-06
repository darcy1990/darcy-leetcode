import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/12 3:18 下午
 */
public class FirstMissingPositiveTest {

    @Test
    public void firstMissingPositive() {
        FirstMissingPositive f = new FirstMissingPositive();
        Assert.assertEquals(3, f.firstMissingPositive(new int[]{0, 1, 2}));
        Assert.assertEquals(3, f.firstMissingPositive(new int[]{2, 1}));
        Assert.assertEquals(2, f.firstMissingPositive(new int[]{1, 1}));
        Assert.assertEquals(2, f.firstMissingPositive(new int[]{1}));
        Assert.assertEquals(3, f.firstMissingPositive(new int[]{1, 2, 0}));
        Assert.assertEquals(2, f.firstMissingPositive(new int[]{3,4,-1,1}));
        Assert.assertEquals(2, f.firstMissingPositive(new int[]{7,8,9,11,12,3,4,-1,1}));
        Assert.assertEquals(7, f.firstMissingPositive(new int[]{1,2,6,3,5,4}));
    }
}