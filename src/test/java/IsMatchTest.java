import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/3 6:45 下午
 */
public class IsMatchTest {

    @Test
    public void isMatch() {
        IsMatch2 im = new IsMatch2();
        System.out.println(im.isMatch("", "a"));
        System.out.println(im.isMatch("aa", "a*"));
        System.out.println(im.isMatch("ab", ".*"));
        System.out.println(im.isMatch("aab", "c*a*b"));
        System.out.println(im.isMatch("mississippi", "mis*is*p*."));
        System.out.println(im.isMatch("aaa", "a.a"));
        System.out.println(im.isMatch("a", "ab*"));
        System.out.println(im.isMatch("a", ".*..a*"));
        System.out.println(im.isMatch("bb", ".bab"));
        System.out.println(im.isMatch("aab", "c*a*b"));
    }
}