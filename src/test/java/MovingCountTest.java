import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/28 5:58 下午
 */
public class MovingCountTest {

    @Test
    public void movingCount() {
        MovingCount mc = new MovingCount();
        int c = mc.movingCount(7, 2, 3);
        System.out.println(c);
    }
}