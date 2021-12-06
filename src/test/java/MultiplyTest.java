import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/13 4:22 下午
 */
public class MultiplyTest {

    @Test
    public void multiply() {
        Multiply m = new Multiply();
        String ans = m.multiply("123242341232", "4564123412342");
        System.out.println(ans);
    }
}