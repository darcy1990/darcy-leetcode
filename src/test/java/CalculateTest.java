import org.junit.Test;
import string.Calculate;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/28 6:34 下午
 */
public class CalculateTest {

    @Test
    public void calculate() {
        Calculate c = new Calculate();
        int ans = c.calculate("42");
        System.out.println(ans);
    }
}