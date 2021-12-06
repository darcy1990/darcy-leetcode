package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/26 11:42 上午
 */
public class MaxProfit3 {

    public int maxProfit(int[] prices, int k) {
        // leetcode 123,188 通用解法
        // dp[i][k][0] = dp[i - 1][k][0], dp[i - 1][k - 1][1] + p[i]
        // dp[i][k][1] = dp[i - 1][k][1], dp[i - 1][k - 1][0] - p[i]
        if (k == 0 || prices.length == 0) {
            return 0;
        }
        k *= 2;
        int max = 0;
        int minV = -1000000;
        int[][][] dp = new int[prices.length][k + 1][2];
        dp[0][0][0] = 0;
        dp[0][0][1] = minV;
        dp[0][1][1] = - prices[0];
        dp[0][1][0] = minV;
        for (int j = 2; j < k + 1; j++) {
            dp[0][j][0] = minV;
            dp[0][j][1] = minV;
        }

        for (int i = 1; i < prices.length; i++) {
            dp[i][0][1] = minV;
            dp[i][0][0] = 0;
        }

        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < k + 1; j++) {
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j - 1][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);

                if (j % 2 == 0) {
                    max = Math.max(dp[i][j][0], max);
                }
            }
        }

        return max;
    }
}
