/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/12 6:21 下午
 */
public class RotationSearch {

    public int search(int[] nums, int target) {
        return specialRecursionBinarySearch(nums, target, 0, nums.length - 1);
    }

    public static int specialRecursionBinarySearch(int[] arr, int key, int low, int high) {
        if (arr[low] <= arr[high]) {
            return recursionBinarySearch(arr, key, low, high);
        }

        int middle = (low + high) / 2;
        int r = specialRecursionBinarySearch(arr, key, low, middle);
        if (r > -1) {
            return r;
        }

        int s = specialRecursionBinarySearch(arr, key, middle  + 1, high);
        if (s > -1) {
            return s;
        }

        return -1;
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
