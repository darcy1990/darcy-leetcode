package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/1 11:51 上午
 */
public class Rob {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int dp[] = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                dp[i] = nums[0];
                continue;
            }
            if (i == 1) {
                dp[i] = Math.max(nums[0], nums[1]);
                continue;
            }
            if (i == 2) {
                dp[i] = nums[0] + nums[2];
                continue;
            }
            dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
        }

        int max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;
    }


}
