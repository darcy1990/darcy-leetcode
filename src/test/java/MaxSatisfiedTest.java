import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/12 5:44 下午
 */
public class MaxSatisfiedTest {

    @Test
    public void maxSatisfied() {
        MaxSatisfied ms = new MaxSatisfied();
        int ans = ms.maxSatisfied(new int[]{1}, new int[]{0}, 3);
        System.out.println(ans);
    }
}