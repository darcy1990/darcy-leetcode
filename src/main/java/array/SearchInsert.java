package array;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        return recursionBinarySearch(nums, target, 0, nums.length - 1);
    }

    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {
        if (low == high) {
            if (arr[low] == key || arr[low] > key) {
                return low;
            }

            if (arr[low] < key) {
                return low + 1;
            }
        }
        if (key < arr[low]) {
            return low;
        }

        if (key > arr[high]) {
            return high + 1;
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return recursionBinarySearch(arr, key, low, middle);
        } else if (arr[middle] < key) {
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }

}
