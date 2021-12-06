/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/20 3:57 下午
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int i = recursionBinarySearch(nums, target, 0, nums.length - 1);
        if (i < 0) {
            return new int[]{-1, -1};
        }

        int r = i;
        for (int m = i; m >= 0; m--) {
            if (nums[m] == target) {
                r = m;
            } else {
                break;
            }
        }

        int s = i;
        for (int n = i; n < nums.length; n++) {
            if (nums[n] == target) {
                s = n;
            } else {
                break;
            }
        }

        return new int[]{r, s};
    }

    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }
}
