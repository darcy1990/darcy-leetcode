package dp;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/24 11:40 上午
 */
public class LargestSumOfAveragesTest {

    @Test
    public void largestSumOfAverages() {
        LargestSumOfAverages ls = new LargestSumOfAverages();
        double ans = ls.largestSumOfAverages(new int[]{1,2,3,4,5,6,7}, 4);
        System.out.println(ans);
    }
}