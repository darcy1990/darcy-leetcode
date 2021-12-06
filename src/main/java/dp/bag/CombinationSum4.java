package dp.bag;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/3 6:23 下午
 */
public class CombinationSum4 {

    public int combinationSum4(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
        }
        int m = target / min + 1;
        int[][] dp = new int[m + 1][target + 1];
        dp[0][0] = 1;
        int ans = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                for (int k = 0; k < nums.length; k++) {
                    dp[i][j] += j - nums[k] >= 0 ? dp[i - 1][j - nums[k]] : 0;
                }
            }

            ans += dp[i][target];
        }

        return ans;
    }
}
