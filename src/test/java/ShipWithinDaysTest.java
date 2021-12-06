import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/12 4:33 下午
 */
public class ShipWithinDaysTest {

    @Test
    public void shipWithinDays() {
        ShipWithinDays sw = new ShipWithinDays();
        int k = sw.shipWithinDays(new int[]{1}, 4);
        System.out.println(k);
    }
}