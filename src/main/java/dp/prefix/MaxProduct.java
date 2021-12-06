package dp.prefix;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/15 6:20 下午
 */
public class MaxProduct {

    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[0] = nums[0];
                continue;
            }
            int k = nums[i];
            int max = nums[i];
            for (int j = i; j > 0; j--) {
                if (dp[j - 1] > 0 && k * dp[j - 1] > 0) {
                    max = k * dp[j - 1];
                    break;
                }

                max = Math.max(Math.max(max, k * dp[j - 1]), k * nums[j - 1]);
                k = k * nums[j - 1];
            }

            dp[i] = max;
        }

        int max = nums[0];
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
