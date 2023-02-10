package number;

public class CanPartitionKSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (k == 1) {
            return true;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % k != 0) {
            return false;
        }

        int[] subsets = new int[k];
        return canPartitionKSubsets(nums, 0, subsets, sum / k);
    }

    public boolean canPartitionKSubsets(int[] nums, int i, int[] subsets, int s) {
        if (i == nums.length) {
            for (int j = 0; j < subsets.length; j++) {
                if (subsets[j] != s) {
                    return false;
                }
            }

            return true;
        }

        boolean r = false;
        for (int j = 0; j < subsets.length; j++) {
            if (subsets[j] == s) {
                continue;
            }

            if (subsets[j] + nums[i] <= s) {
                subsets[j] += nums[i];
                r = canPartitionKSubsets(nums, i + 1, subsets, s); // try，注意这里不要用++i
                if (r) {
                    return true;
                } else {
                    subsets[j] -= nums[i]; // 回溯

                    if (subsets[j] == 0) {
                        return false;
                    }
                }
            }
        }

        return r;
    }
}
