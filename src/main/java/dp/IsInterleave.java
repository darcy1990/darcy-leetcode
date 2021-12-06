package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/27 1:44 下午
 */
public class IsInterleave {

    public boolean isInterleave(String s1, String s2, String s3) {
        // dp[i][j][k] = dp[i - 1][j][k - 1]  s3 == s1 || dp[i][j][k - 1] s3 == s2
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if (len1 + len2 != len3) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for (int i = 0; i < len2 && i < len3; i++) {
            if (c2[i] == c3[i]) {
                dp[0][i + 1] = true;
            } else {
                break;
            }
        }
        for (int i = 0; i < len1 && i < len3; i++) {
            if (c1[i] == c3[i]) {
                dp[i + 1][0] = true;
            } else {
                break;
            }
        }

        if (dp[len1][len2]) {
            return true;
        }
        for (int i = 1; i < len1 + 1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                dp[i][j] =  (c1[i - 1] == c3[i + j - 1] ? dp[i - 1][j] : false)
                        ||  (c2[j - 1] == c3[i + j - 1] ? dp[i][j - 1] : false);
            }
        }

        return dp[len1][len2];
    }
}
