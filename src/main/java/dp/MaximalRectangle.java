package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/28 2:03 下午
 */
public class MaximalRectangle {

    private boolean[][][][] dp;

    public int maximalRectangle(char[][] matrix) {
        // dp[i1][i2][j1][j2] = dp[i1 + 1][i2][j1][j2] (i1, j1, j2 = false)  +
        // dp[i1][i2 - 1][j1][j2] (i2, j1, j2 = false)
        // dp[i1][i2][j1 + 1][j2] (i1, i2, j1 = false)
        // dp[i1][i2][j1][j2 - 1] (i1, j1, j2 = false)
        if (matrix.length == 0) {
            return 0;
        }
        int len = matrix.length;
        int width = matrix[0].length;
        dp = new boolean[len][len][width][width];
        int ans = 0;
        for (int k = 0; k < len + width; k++) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < width; j++) {
                    if (k == 0) {
                        dp[i][i][j][j] = matrix[i][j] == '1';
                        if (ans == 0) {
                            ans = Math.max(dp[i][i][j][j] ? 1 : 0, ans);
                        }
                        continue;
                    }
                    for (int l = 0; l <= k; l++) {
                        int ik = i + l;
                        int jk = j + k - l;
                        if (ik >= len || jk >= width) {
                            continue;
                        }
                        int area = (ik - i + 1) * (jk - j + 1);
                        if (isRec(i, ik, j, jk)) {
                            dp[i][ik][j][jk] = true;
                            ans = Math.max(area, ans);
                            // System.out.println(i + " " + ik + " " + j + " " + jk + " " + area);
                        }
                    }
                }
            }
        }

        return ans;
    }

    private boolean isRec(int i, int ik, int j ,int jk) {
        boolean m2 = (ik - 1 >= i) && dp[i][ik - 1][j][jk] && dp[ik][ik][j][jk];
        if (m2) {
            return true;
        }
        boolean n2 = (jk - 1 >= j) && dp[i][ik][j][jk - 1] && dp[i][ik][jk][jk];
        if (n2) {
            return true;
        }
        return false;
    }
}
