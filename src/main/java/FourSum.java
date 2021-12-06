import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/25 9:10 下午
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }
        int length = nums.length;
        List<List<Integer>> ret = new ArrayList<>();;
        Arrays.sort(nums);
        for (int m = 0; m < nums.length - 3; m++) { // 满满的细节：nums.length - 3
            // 细节
            if (nums[m] + nums[m + 1] + nums[m + 2] + nums[m + 3] > target) {
                break;
            }
            // 细节
            if (nums[m] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }
            for (int n = m + 1; n < nums.length - 2; n++) {
                if (nums[m] + nums[n] + nums[n + 1] + nums[n + 2] > target) {
                    break;
                }
                if (nums[m] + nums[n] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }
                int q = nums.length - 1;
                for (int p = n + 1; p < nums.length;p++) {
                    while (q > p && nums[n] + nums[p] + nums[q] > target - nums[m]) {
                        q--;
                    }

                    if (p == q) {
                        continue;
                    }
                    if (nums[m] + nums[n] + nums[p] + nums[q] == target) {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[m]);
                        l.add(nums[n]);
                        l.add(nums[p]);
                        l.add(nums[q]);
                        ret.add(l);
                    }

                    while (p + 1 < nums.length && nums[p] == nums[p + 1]) {
                        p++;
                    }
                }

                while (n + 1 < nums.length && nums[n] == nums[n + 1]) {
                    n++;
                }
            }
            while (m + 1 < nums.length && nums[m] == nums[m + 1]) {
                m++;
            }
        }

        return ret;
    }
}
