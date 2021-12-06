package dp.bag;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/3 5:29 下午
 */
public class CanPartition {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }

        return canPartition(nums, sum / 2);
    }

    public boolean canPartition(int[] nums, int amount) {
        boolean[][] dp = new boolean[nums.length + 1][amount + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                dp[i][j] = dp[i - 1][j] || (j - nums[i - 1] >= 0 ? dp[i - 1][j - nums[i - 1]] : false);
            }
        }

        return dp[nums.length][amount];
    }
}
