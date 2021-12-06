import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/13 6:10 下午
 */
public class LongestValidParenthesesTest {

    @Test
    public void longestValidParentheses() {
        LongestValidParentheses l = new LongestValidParentheses();
        System.out.println(l.longestValidParentheses("(()"));
        System.out.println(l.longestValidParentheses(")()())"));
        System.out.println(l.longestValidParentheses("()(()"));
    }
}