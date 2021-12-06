import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/9 6:16 下午
 */
public class MinArrayTest {

    @Test
    public void minArray() {
        MinArray ma = new MinArray();
        int c = ma.minArray(new int[]{3,4,5,1,2});
        System.out.println(c);
    }
}