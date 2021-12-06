package dp.num;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/30 5:16 下午
 */
public class KnightDialer {

    public int knightDialer(int n) {
        int MOD = 1_000_000_007;
        int[][] dp = new int[n + 1][10];
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][4] + dp[i - 1][6]) % MOD;
            dp[i][1] = (dp[i - 1][6] + dp[i - 1][8]) % MOD;
            dp[i][2] = (dp[i - 1][7] + dp[i - 1][9]) % MOD;
            dp[i][3] = (dp[i - 1][4] + dp[i - 1][8]) % MOD;
            dp[i][4] = ((dp[i - 1][3] + dp[i - 1][9]) % MOD + dp[i - 1][0]) % MOD;
            dp[i][5] = 0;
            dp[i][6] = ((dp[i - 1][1] + dp[i - 1][7]) % MOD + dp[i - 1][0]) % MOD;
            dp[i][7] = (dp[i - 1][2] + dp[i - 1][6]) % MOD;
            dp[i][8] = (dp[i - 1][1] + dp[i - 1][3]) % MOD;
            dp[i][9] = (dp[i - 1][2] + dp[i - 1][4]) % MOD;
        }

        int s = 0;
        for (int i = 0; i < 10; i++) {
            s = (s + dp[n][i]) % MOD;
        }

        return s;
    }
}
