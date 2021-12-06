package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/24 6:31 下午
 */
public class MaxProfitCold {

    public int maxProfit(int[] prices) {
        // k = 1 持有, 0 没有持有
        // dp[i][0] = dp[i - 1][0], dp[i - 1][1] + p[i]
        // dp[i][1] = dp[i - 1][1], dp[i - 2][0] - p[i]
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                dp[i][0] = 0;
                dp[i][1] = - prices[0];
                continue;
            }
            if (i == 1) {
                dp[i][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
                dp[i][1] = Math.max(dp[0][1], -prices[1]);
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }

        return dp[prices.length - 1][0];
    }
}
