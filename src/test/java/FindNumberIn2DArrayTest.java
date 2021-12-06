import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/12 1:19 下午
 */
public class FindNumberIn2DArrayTest {

    @Test
    public void test() {
        FindNumberIn2DArray fn = new FindNumberIn2DArray();
        boolean ans = fn.findNumberIn2DArray(new int[][]{{1},{3},{5}
                }, 2);
        System.out.println(ans);
    }

}