/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/12 5:33 下午
 */
public class MaxSatisfied {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int len = customers.length;
        int[] dp = new int[len];
        int t = 0;
        for (int i = 0; i < len; i++) {
            if (i < minutes || grumpy[i] == 0) {
                t += customers[i];
            }
        }
        dp[0] = t;

        for (int i = 1; i < len - minutes + 1; i++) {
            dp[i] = dp[i - 1] - (grumpy[i - 1] == 1 ? customers[i - 1] : 0) + (grumpy[i + minutes - 1] == 1 ? customers[i + minutes - 1] : 0);
        }

        int max = dp[0];
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
