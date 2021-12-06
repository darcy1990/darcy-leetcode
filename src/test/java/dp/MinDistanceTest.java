package dp;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/26 6:33 下午
 */
public class MinDistanceTest {

    @Test
    public void minDistance() {
        MinDistance md = new MinDistance();
        int ans = md.minDistance("intention", "execution");
        System.out.println(ans);
    }
}