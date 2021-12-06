import dp.Rob;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/1 3:24 下午
 */
public class RobTest {

    @Test
    public void rob() {
        Rob r = new Rob();
        int m = r.rob(new int[]{1,2,3,1});
        System.out.println(m);
    }
}