import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/6 5:49 下午
 */
public class CanCompleteCircuitTest {

    @Test
    public void canCompleteCircuit() {
        CanCompleteCircuit ccc = new CanCompleteCircuit();
        int r = ccc.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3});
        System.out.println(r);
    }
}