/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/8 4:16 下午
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return;
        }
        for (int i = len - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                int v = nums[i];

                // find min index
                int j = i;
                while(j < nums.length && nums[j] > nums[i -1]) j++;
                int mi = j -1;

                // swap
                int s = nums[i - 1];
                nums[i - 1] = nums[mi];
                nums[mi] = s;

                // reverse
                for (int k = 0; k <= (nums.length - 1 - i) / 2; k++) {
                    int c = nums[i + k];
                    nums[i + k] = nums[nums.length - 1 - k];
                    nums[nums.length - 1 - k] = c;
                }
                return;
            }
        }

        for (int i = 0; i <= (len - 1)/ 2; i++) {
            int v = nums[i];
            nums[i] = nums[len - 1 - i];
            nums[len - 1 -i] = v;
        }

        return;
    }
}
