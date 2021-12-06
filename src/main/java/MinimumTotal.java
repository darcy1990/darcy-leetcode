import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/17 11:39 上午
 */
public class MinimumTotal {

    private int[][] dp;

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.isEmpty()) {
            return 0;
        }

        int size = triangle.size();
        dp = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int c = triangle.get(i).get(j);
                if (i == 0) {
                    dp[i][j] = c;
                    continue;
                }

                if (j == 0) {
                    dp[i][j] = c + dp[i - 1][j];
                    continue;
                }

                dp[i][j] = j < triangle.get(i - 1).size() ? Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + c : dp[i - 1][j - 1] + c;
            }
        }

        int min = dp[size - 1][0];
        for (int i = 0; i < size; i++) {
            min = Math.min(min, dp[size - 1][i]);
        }

        return min;
    }
}
