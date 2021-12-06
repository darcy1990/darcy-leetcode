package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/29 11:08 上午
 */
public class FindMaxLength {

    public int findMaxLength(int[] nums) {
        // 前缀和，连续子数组的和为0 （1 -> 1, 0 -> -1）
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1;

            // find pre map
            Integer p = map.get(sum);
            if (p != null) {
                max = Math.max(i - p, max);
                continue;
            }

            map.put(sum, i);
        }

        return max;
    }
}
