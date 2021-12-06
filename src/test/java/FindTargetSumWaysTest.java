import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/26 6:50 下午
 */
public class FindTargetSumWaysTest {

    @Test
    public void findTargetSumWays() {
        FindTargetSumWays fts = new FindTargetSumWays();
        int c = fts.findTargetSumWays(new int[]{2, 107, 109, 113, 127, 131, 137, 3, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 47, 53},
                1000);
        System.out.println(c);
    }
}