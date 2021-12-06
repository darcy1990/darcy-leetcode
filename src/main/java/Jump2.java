import java.util.Arrays;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/25 6:41 下午
 */
public class Jump2 {

    public int jump(int[] nums) {
        int[] steps = new int[nums.length];
        Arrays.fill(steps, -1);
        steps[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= nums[i] && (i + j) < nums.length; j++) {
                if (steps[i + j] < 0) {
                    steps[i + j] = steps[i] + 1;
                    continue;
                }
                steps[i + j] = Math.min(steps[i + j], steps[i] + 1);
            }
        }

        return steps[nums.length - 1];
    }
}
