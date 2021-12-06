package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/22 6:48 下午
 */
public class LargestSumOfAverages {

    public double largestSumOfAverages(int[] nums, int k) {
        // dp[m][k] = Math.max(dp[m - i][k - 1]);
        int[] ps = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ps[i] = sum;
        }

        double[][] av = new double[nums.length][k];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < k; j++) {
                if (j == 0) {
                    av[i][j] = (double) ps[i] / (i + 1);
                    continue;
                }
                if (i < j) {
                    continue;
                }
                double max = 0.0;
                for (int l = 0; l < i; l++) {
                    max = Math.max(av[i - l - 1][j - 1] + (double) (ps[i] - ps[i - l - 1]) / (l + 1), max);
                }
                av[i][j] = max;
            }
        }

        return av[nums.length - 1][k - 1];
    }
}
