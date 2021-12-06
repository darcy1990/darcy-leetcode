import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/22 1:58 下午
 */
public class CanMeasureWaterTest {

    @Test
    public void canMeasureWater() {
        CanMeasureWater cmw = new CanMeasureWater();
        System.out.println(System.currentTimeMillis());
        cmw.canMeasureWater(104579,104593,12444);
        System.out.println(System.currentTimeMillis());
    }
}