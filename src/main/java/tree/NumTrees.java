package tree;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/26 6:07 下午
 */
public class NumTrees {

    public int numTrees(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int s = 0;
            s += dp[i - 1] * 2;
            for (int j = 1; j <= i; j++) {
                s += dp[j - 1] * dp[i - j];
            }
            dp[i] = s;
        }

        return dp[n];
    }
}
