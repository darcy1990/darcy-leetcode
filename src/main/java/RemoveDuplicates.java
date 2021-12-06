/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/9 2:26 下午
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int rt = 0;
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == a) {
                rt++;
            } else {
                nums[i - rt] = nums[i];
                a = nums[i];
            }
        }

        return nums.length - rt;
    }
}
