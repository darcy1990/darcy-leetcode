import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/11 5:57 下午
 */
public class SpiralOrderTest {

    @Test
    public void spiralOrder() {
        SpiralOrder so = new SpiralOrder();
        so.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}