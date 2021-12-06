package array;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/21 2:05 下午
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int total = (0 + len) * (len + 1) / 2;
        for (int i = 0; i < len; i++) {
            total -= nums[i];
        }

        return total;
    }
}
