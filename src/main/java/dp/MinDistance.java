package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/26 5:54 下午
 */
public class MinDistance {

    public int minDistance(String word1, String word2) {
        // f(x, y) = f(x - 1, y -1) w1 = w2
        // min f(x - 1, y -1) + 1, f(x - 1, y) + 1, f(x, y - 1) + 1, w1 != w2
        int lenA = word1.length();
        int lenB = word2.length();
        int[][] dp = new int[lenA + 1][lenB + 1];
        for (int i = 0; i < lenA + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < lenB + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < lenA + 1; i++) {
            for (int j = 1; j < lenB + 1; j++) {
                dp[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? dp[i - 1][j - 1] :
                        Math.min(dp[i - 1][j - 1] + 1, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
            }
        }

        return dp[lenA][lenB];
    }
}
