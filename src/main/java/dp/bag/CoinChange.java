package dp.bag;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/21 2:18 下午
 */
public class CoinChange {


    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        int max = amount + 1;
        for (int i = 1; i < amount + 1; i++) {
            dp[0][i] = max;
        }
        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], (j >= coins[i - 1] ? dp[i][j - coins[i - 1]] : max) + 1);
            }
        }

        return dp[coins.length][amount] < max ? dp[coins.length][amount] : -1;
    }
}
