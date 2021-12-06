/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 9:50 上午
 */
public class MissingNumber2 {

    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }

        return sum;
    }
}
