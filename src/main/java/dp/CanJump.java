package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/3/25 6:45 下午
 */
public class CanJump {

    private boolean[] cannot;

    public boolean canJump(int[] nums) {
        cannot = new boolean[nums.length];
        return canJump(nums, 0);
    }

    private boolean canJump(int[] nums, int i) {
        if (i + nums[i] >= nums.length - 1) {
            return true;
        }
        for (int j = nums[i]; j >= 1 && (i + j) <= nums.length -1; j--) {
            if (cannot[i + j]) {
                return false;
            }
            if (canJump(nums, i + j)) {
                return true;
            }
        }

        cannot[i] = true;
        return false;
    }
}
