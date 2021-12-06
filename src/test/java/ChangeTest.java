import dp.Change;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/21 2:36 下午
 */
public class ChangeTest {

    @Test
    public void coinChange() {
        Change c = new Change();
        int ans = c.change(500, new int[]{3,5,7,8,9,10,11});
        System.out.println(ans);
    }
}