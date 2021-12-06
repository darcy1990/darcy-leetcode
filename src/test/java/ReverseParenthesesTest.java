import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 6:32 下午
 */
public class ReverseParenthesesTest {

    @Test
    public void reverseParentheses() {
        ReverseParentheses rp = new ReverseParentheses();
        String s = rp.reverseParentheses( "a(bcdefghijkl(mno)p)q");
        System.out.println(s);
    }
}