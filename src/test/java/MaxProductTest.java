import dp.prefix.MaxProduct;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/15 6:32 下午
 */
public class MaxProductTest {

    @Test
    public void test() {
        MaxProduct mp = new MaxProduct();
        int product = mp.maxProduct(new int[]{2, 3, -2, 4});
        System.out.println(product);
    }

}