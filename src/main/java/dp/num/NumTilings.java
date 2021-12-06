package dp.num;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/30 3:27 下午
 */
public class NumTilings {

    public int numTilings(int n) {
        int MOD = 1_000_000_007;
        if (n == 1) {
            return 1;
        }
        int dp[][] = new int[n + 1][3];
        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i][0] = ((dp[i - 1][0] + dp[i - 2][0]) % MOD + (dp[i - 1][1] + dp[i - 1][2]) % MOD) % MOD;
            dp[i][1] = (dp[i - 2][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 2][0] + dp[i - 1][1]) % MOD;
        }

        return dp[n][0];
    }
}
