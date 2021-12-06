import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/28 8:16 下午
 */
public class GetPermutationTest {

    @Test
    public void getPermutation() {
        GetPermutation gp = new GetPermutation();
        Assert.assertEquals("213", gp.getPermutation(3, 3));
        Assert.assertEquals("2314", gp.getPermutation(4, 9));
        Assert.assertEquals("123", gp.getPermutation(3, 1));
        Assert.assertEquals("231", gp.getPermutation(3, 4));
        Assert.assertEquals("124658793", gp.getPermutation(9, 50000));
    }
}