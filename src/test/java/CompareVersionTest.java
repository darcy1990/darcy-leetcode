import org.junit.Test;
import string.CompareVersion;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/13 6:13 下午
 */
public class CompareVersionTest {

    @Test
    public void compareVersion() {
        CompareVersion cv = new CompareVersion();
        int ans = cv.compareVersion("1.01", "1.001");
        System.out.println(ans);
    }
}