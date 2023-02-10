package array;

public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 < nums.length - 1 && nums[p1] < nums[p1 + 1]) { // 找到最长的升序子数组
            p1++;
        }

        int q1 = p1 + 1;
        while (q1 <= nums.length - 1) {
            while (p1 >= 0 && nums[q1] < nums[p1]) { // 和后续元素比较，缩短上面的升序子数组
                p1--;
            }

            q1++;
        }

        while (p2 > 0 && nums[p2] >= nums[p2 - 1]) {
            p2--;
        }

        int q2 = p2 - 1;
        while (q2 >= 0) {
            while (p2 <= nums.length - 1 && nums[q2] > nums[p2]) {
                p2++;
            }

            q2--;
        }

        return p2 > p1 ? p2 - p1 - 1 : 0;
    }
}
