import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 10:31 上午
 */
public class LargestNumberTest {

    @Test
    public void largestNumber() {
        LargestNumber ln = new LargestNumber();
        String s = ln.largestNumber(new int[]{10,2});
        System.out.println(s);
    }
}