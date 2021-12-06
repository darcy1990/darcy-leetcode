import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/27 5:58 下午
 */
public class NearestExitTest {

    @Test
    public void nearestExit() {
        NearestExit ne = new NearestExit();
        int ans = ne.nearestExit(new char[][]{{'.'}}, new int[]{0, 0});
        System.out.println(ans);
    }
}