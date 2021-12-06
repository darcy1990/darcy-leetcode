import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/17 10:14 上午
 */
public class TrapTest {

    @Test
    public void trap() {
        Trap2 t = new Trap2();
        int ans = t.trap(new int[]{5,4,1,2});
        System.out.println(ans);
    }
}