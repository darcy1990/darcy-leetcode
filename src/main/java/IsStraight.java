import java.util.Arrays;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/21 4:45 下午
 */
public class IsStraight {



    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        int distance = 0;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            if (k == 0) {
                c++;
                continue;
            }

            if (last != 0) {
                if (k == last) {
                    return false;
                }
                distance += (k - last - 1);
            }
            last = k;
        }

        return distance <= c;
    }
}
