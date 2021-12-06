package array;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/17 5:49 下午
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }

            if (sum > target) {
                j--;
            }

            if (sum < target) {
                i++;
            }
        }

        return new int[]{-1, -1};
    }
}
