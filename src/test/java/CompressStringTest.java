import org.junit.Test;
import string.CompressString;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/11 6:03 下午
 */
public class CompressStringTest {

    @Test
    public void compressString() {
        CompressString cs = new CompressString();
        String ans = cs.compressString("abbccd");
        System.out.println(ans);
    }
}