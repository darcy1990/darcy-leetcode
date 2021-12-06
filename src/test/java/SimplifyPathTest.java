import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/7 6:01 下午
 */
public class SimplifyPathTest {

    @Test
    public void simplifyPath() {
        SimplifyPath sp = new SimplifyPath();
        String s = sp.simplifyPath("/a/./b/../../c/");
        System.out.print(s);
    }
}