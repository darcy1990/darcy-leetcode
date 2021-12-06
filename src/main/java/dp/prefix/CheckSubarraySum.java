package dp.prefix;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/30 11:39 上午
 */
public class CheckSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int remain = 0;
        for (int i = 0; i < nums.length; i++) {
            remain += nums[i];
            remain = remain % k;
            if (map.containsKey(remain)) {
                if ((i - map.get(remain) >= 2)) {
                    return true;
                }
            } else {
                map.put(remain, i);
            }
        }

        return false;
    }
}
