package dp.prefix;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/30 3:31 下午
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        // prefix
        int len = nums.length;
        int[] output = new int[len];
        int p = 1;
        for (int i = 0; i < len; i++) {
            p *= nums[i];
            output[i] = p;
        }

        // suffix
        p = 1;
        for (int i = len - 1; i >= 0; i--) {
            p *= nums[i];
            nums[i] = p;
        }

        // product
        output[len - 1] = output[len - 2];

        int pre = 1;
        for (int i = 0; i < len; i++) {
            int tmp = (i - 1 >= 0 ? output[i - 1] : 1) * (i + 1 < len ? nums[i + 1] : 1);
            if (i > 0) {
                output[i - 1] = pre;
            }
            pre = tmp;
        }

        return output;
    }
}
