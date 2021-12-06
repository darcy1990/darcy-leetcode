import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/28 6:25 下午
 */
public class GetHintTest {

    @Test
    public void getHint() {
        GetHint g = new GetHint();
        System.out.println(g.getHint("1807", "7810"));
        System.out.println(g.getHint("1123", "0111"));
        System.out.println(g.getHint("11", "11"));
        System.out.println(g.getHint("1122", "2211"));
    }
}