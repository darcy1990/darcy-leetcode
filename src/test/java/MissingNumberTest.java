import array.MissingNumber;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/21 2:12 下午
 */
public class MissingNumberTest {

    @Test
    public void missingNumber() {
        MissingNumber mn = new MissingNumber();
        mn.missingNumber(new int[]{3, 0, 1});
    }
}