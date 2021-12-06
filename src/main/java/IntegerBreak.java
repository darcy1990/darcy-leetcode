/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/21 6:12 下午
 */
public class IntegerBreak {

    public int integerBreak(int n) {
        if (n <= 1) {
            return n;
        }

        if (n == 2) {
            return 1;
        }

        if (n == 3) {
            return 2;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i/2 + 1; j++) {
                if (j == 0) {
                    dp[i] = Math.max(i, dp[i]);
                } else {
                    dp[i] = Math.max(dp[i - j] * j, dp[i]);
                }
            }
        }

        return dp[n];
    }
}
