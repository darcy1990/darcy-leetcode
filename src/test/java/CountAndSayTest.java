import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/14 9:27 下午
 */
public class CountAndSayTest {

    @Test
    public void countAndSay() {
        CountAndSay c = new CountAndSay();
        for (int i = 1; i < 30; i++) {
            System.out.println(c.countAndSay(i));
        }
    }
}