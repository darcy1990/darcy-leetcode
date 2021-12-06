import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 2:05 下午
 */
public class MaxEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                return o2[1] - o1[1];
            }
        });

        int[] sub = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            sub[i] = envelopes[i][1];
        }

        return lengthOfLIS(sub);
    }

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        int max = -1;
        for (int i = 0; i < dp.length; i++) {
            max = max > dp[i] ? max : dp[i];
        }

        return max;
    }
}
