/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 6:08 下午
 */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int v = nums[i];
            if (arr[v] == 0) {
                arr[v] = 1;
            } else {
                return v;
            }
        }

        return -1;
    }
}
