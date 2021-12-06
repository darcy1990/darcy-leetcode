package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/1 11:51 上午
 */
public class Rob2 {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        if (len == 1) {
            return nums[0];
        }

        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }

        if (len == 3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }
        int dp[][] = new int[len][2];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                dp[0][1] = nums[0];
                dp[0][0] = 0;
                continue;
            }
            if (i == 1) {
                dp[1][1] = 0;
                dp[1][0] = nums[1];
                continue;
            }
            if (i == 2) {
                dp[2][1] = nums[0] + nums[2];
                dp[2][0] = nums[2];
                continue;
            }

            dp[i][0] = Math.max(dp[i - 2][0], dp[i - 3][0]) + nums[i];
            if (i == len - 1) {
                dp[i][1] = 0;
            } else {
                dp[i][1] = Math.max(dp[i - 2][1], dp[i - 3][1]) + nums[i];
            }
        }

        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 2; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }


}
