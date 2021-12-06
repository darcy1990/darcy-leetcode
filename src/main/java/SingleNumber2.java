/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 5:37 下午
 */
public class SingleNumber2 {

    public int singleNumber(int[] nums) {
        int[] bits = new int[32];
        for (int i = 0; i < 32; i++) {
            int b = 0;
            for (int j = 0; j < nums.length; j++) {
                b += (nums[j] >> i) & 1;
            }

            bits[i] = b % 3;
        }

        int ans = 0;
        for (int i = 0; i < bits.length ; i++) {
            if (bits[i] > 0) {
                ans |= 1 << i;
            }
        }

        return ans;
    }
}
