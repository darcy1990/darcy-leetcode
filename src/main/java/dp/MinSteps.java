package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/28 4:25 下午
 */
public class MinSteps {

    public int minSteps(int n) {
        // n 当前字符数
        // pn copy的字符数
        // f(n, pn) -> f(n, n) , copy all
        // f(n, pn) -> f(n + pn, pn), paste

        // 0 copy
        // 1 paste
        int[][] dp = new int[n + 1][n + 1];
        int MAX = 10000;
        int ans = MAX;
        dp[1][0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = MAX;
                if (i == 1 && j == 0) {
                    dp[1][0] = 0;
                    if (i == n) {
                        ans = Math.min(dp[i][j], ans);
                    }
                    continue;
                }
                if (i <= 0 || j <= 0) {
                    continue;
                }
                if (i % j != 0) {
                    continue;
                }
                if (i == j) {
                    for (int k = 0; k <= j; k++) {
                        if (k != 0 && i % k != 0) {
                            continue;
                        }
                        // copy
                        dp[i][j] = Math.min(dp[i][k] + 1, dp[i][j]);
                    }
                } else {
                    if (i - j >= j && (i - j) % j == 0) {
                        // paste
                        dp[i][j] = dp[i - j][j] + 1;
                    }
                }

                if (i == n) {
                    ans = Math.min(dp[i][j], ans);
                }
            }
        }

        return ans;
    }
}
