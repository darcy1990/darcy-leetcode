import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/11 5:05 下午
 */
public class MergeIntervalTest {

    @Test
    public void merge() {
        MergeInterval mi = new MergeInterval();
        mi.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
    }
}