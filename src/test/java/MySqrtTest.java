import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/7 6:52 下午
 */
public class MySqrtTest {

    @Test
    public void mySqrt() {
        MySqrt ms = new MySqrt();
        int s = ms.mySqrt(10000);
        System.out.println(s);
    }
}