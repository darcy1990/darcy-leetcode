/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/12 2:44 下午
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int len = nums.length;

        int max = len;
        for (int i = 0; i < len; i++) {
            max = Math.max(nums[i], max);
        }

        max++;

        for (int i = 0; i < len; i++) {
            fill(nums, i, len, false, max);
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != max) {
                return i + 1;
            }
        }

        return len + 1;
    }

    private void fill(int[] nums, int k, int len, boolean pre, int max) {
        if (nums[k] == max) {
            return;
        }

        if (pre) {
            int c = nums[k];
            nums[k] = max;
            if (c >= 1 && c <= len) {
                fill(nums, c - 1, len, true, max);
            }
            return;
        }

        if (nums[k] >= 1 && nums[k] <= len) {
            int v = nums[k] - 1;
            if (k != v) {
                fill(nums, v, len, true, max);
            } else {
                nums[k] = max;
            }
        } else {
            nums[k] = 0;
        }
    }
}
