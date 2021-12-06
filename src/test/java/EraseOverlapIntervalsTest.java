import array.EraseOverlapIntervals;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/13 5:58 下午
 */
public class EraseOverlapIntervalsTest {

    @Test
    public void eraseOverlapIntervals() {
        EraseOverlapIntervals eo = new EraseOverlapIntervals();
        int ans = eo.eraseOverlapIntervals(new int[][]{{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}});
        System.out.println(ans);
    }
}