package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/27 3:36 下午
 */
public class IsScramble {

    public boolean isScramble(String s1, String s2) {
        // dp(i, j) = dp(i - k, j - k) k = 1 ~ n
        // dp(10, 10) = dp(0 1, 0 1) && dp(1 9, 1 9) dp(0 1, 8 9) && dp(1 9, 0 8)
        // dp(0 2, 0 2) && dp(2 8, 2 8)
        // i   i + k            i + k + 1         i + m
        // j   j + k            j + k + 1         j + m
        // j   j + m - k - 1    j + m - k         j + m
        if (s1.length() == 1 && s2.length() == 1) {
            return s1.equals(s2);
        }
        int len = s1.length();
        boolean dp[][][][] = new boolean[len][len][len][len];

        for (int m = 0; m < len; m++) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i + m >= len || j + m >= len) {
                        continue;
                    }
                    if (m == 0) {
                        dp[i][i][j][j] = s1.charAt(i) == s2.charAt(j);
                        continue;
                    }

                    for (int k = 0; k < m; k++) {
                        dp[i][i + m][j][j + m] |= (dp[i][i + k][j][j + k] && dp[i + k + 1][i + m][j + k + 1][j + m])
                                || (dp[i][i + k][j + m - k][j + m] && dp[i + k + 1][i + m][j][j + m - k - 1]);
                        if (dp[i][i + m][j][j + m]) {
                            break;
                        }
                    }
                }
            }
        }

        return dp[0][len - 1][0][len - 1];
    }
}
