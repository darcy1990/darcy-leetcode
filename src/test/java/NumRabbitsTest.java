import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 4:08 下午
 */
public class NumRabbitsTest {

    @Test
    public void numRabbits() {
        NumRabbits nr = new NumRabbits();
        int t = nr.numRabbits(new int[]{1, 1, 2});
        System.out.println(t);
    }
}