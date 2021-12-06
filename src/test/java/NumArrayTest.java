import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/7 2:54 下午
 */
public class NumArrayTest {

    @Test
    public void build() {
        NumArray na = new NumArray(new int[]{1, 3, 5});
        int s1 = na.sumRange(0, 2);
        System.out.println(s1);
        na.update(1, 2);
        int s2 = na.sumRange(0, 2);
        System.out.println(s2);
    }
}