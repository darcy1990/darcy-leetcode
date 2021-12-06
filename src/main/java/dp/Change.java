package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/6 6:17 下午
 */
public class Change {

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = (i > 0 ? dp[i - 1][j] : 0) + (j >= coins[i] ? dp[i][j - coins[i]] : 0);
            }
        }

        return dp[coins.length - 1][amount];
    }
}