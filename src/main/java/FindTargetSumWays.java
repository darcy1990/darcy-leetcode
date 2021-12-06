/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/26 6:28 下午
 */
public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int target) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            offset += nums[i];
        }
        if (target > offset || target < -offset) {
            return 0;
        }
        int[][] dp = new int[nums.length ][2 * offset + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2 * offset; j++) {
                if (i == 0) {
                    dp[i][j] = (j == offset + nums[0] ? 1 : 0) +  (j == offset - nums[0] ? 1 : 0);
                    continue;
                }

                dp[i][j] = ((j + nums[i] > 2 * offset) || (j + nums[i] < 0) ? 0 : (dp[i - 1][j + nums[i]]))
                         + ((j - nums[i] > 2 * offset) || (j - nums[i] < 0) ? 0 : (dp[i - 1][j - nums[i]]));
            }
        }

        return dp[nums.length - 1][target + offset];
    }
}
