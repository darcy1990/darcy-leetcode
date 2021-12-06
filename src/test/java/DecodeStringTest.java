import org.junit.Test;
import string.DecodeString;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 4:05 下午
 */
public class DecodeStringTest {

    @Test
    public void decodeString() {
        DecodeString ds = new DecodeString();
        String ans = ds.decodeString("abc3[cd]xyz");
        System.out.println(ans);
    }
}