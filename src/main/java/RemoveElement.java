/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/25 5:18 下午
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0; i + c < nums.length; i++) {
            if (nums[i] == val) {
                c++;
                // move
                int j = i;
                while (j < nums.length - c) {
                    nums[j] = nums[j + 1];
                    j++;
                }
                // back
                i--;
            }
        }

        return nums.length - c;
    }
}
