package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 5:09 下午
 */
public class LenLongestFibSubseq {

    public int lenLongestFibSubseq(int[] arr) {
        // dp[j, k] = ap[i, j] + 1, a[i] + a[j] = a[k]
        if (arr.length < 3) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int len = arr.length;
        int[][] dp = new int[len][len];
        int max = 0;
        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                Integer m = map.get(arr[j] - arr[i]);
                if (m != null && m != i && m < i) {
                    dp[j][i] = dp[i][m] == 0 ? 3 : dp[i][m] + 1;

                    max = Math.max(max, dp[j][i]);
                }
            }
        }

        return max;
    }
}
