import dp.Rob2;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/14 5:39 下午
 */
public class Rob2Test {

    @Test
    public void rob() {
        Rob2 r = new Rob2();
        int m = r.rob(new int[]{2,3,2});
        System.out.println(m);
    }
}