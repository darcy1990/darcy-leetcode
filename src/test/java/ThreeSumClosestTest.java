import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/7 5:33 下午
 */
public class ThreeSumClosestTest {

    @Test
    public void test() {
        ThreeSumClosest tsc = new ThreeSumClosest();
        int c = tsc.threeSumClosest(new int[]{1, 2, 5, 10, 11}, 12);
        System.out.println(c);
    }

}