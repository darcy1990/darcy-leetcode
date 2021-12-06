/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/26 6:18 下午
 */
public class SortColors {

    public void sortColors(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 <= p2) {
            while (p1 < nums.length && nums[p1] == 0) p1++;
            while (p2 >= 0 && nums[p2] == 2) p2--;

            if (p1 >= p2) {
                return;
            }

            if (nums[p1] == 1) {
                int c1 = p1;
                while ( c1 <= p2 && nums[c1] == 1) c1++;
                if (c1 > p2) {
                    return;
                }
                swap(nums, p1, c1);
                continue;
            }

            if (nums[p2] == 1) {
                int c2 = p2;
                while ( c2 >= p1 && nums[c2] == 1) c2--;
                if (c2 < p1) {
                    return;
                }
                swap(nums, p2, c2);
                continue;
            }

            swap(nums, p1, p2);
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int c = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = c;
    }
}
