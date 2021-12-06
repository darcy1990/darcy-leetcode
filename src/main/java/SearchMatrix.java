/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/7 6:24 下午
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int h = matrix.length;
        int[] m = new int[h];
        for (int i = 0; i < h; i++) {
            m[i] = matrix[i][0];
        }

        int closest = closestBinarySearch(m, target, 0, m.length - 1);
        if (closest < 0) {
            return false;
        }
        int w = matrix[0].length;
        boolean i = recursionBinarySearch(matrix[closest], target, 0, w - 1) >= 0;
        return i;
    }

    public static int closestBinarySearch(int[] arr, int key, int low, int high) {
        if (arr[0] > key) {
            return -1;
        }
        if (low == high) {
            return key >= arr[low] ? low : -1;
        }
        if (low + 1 == high) {
            if (key >= arr[high]) {
                return high;
            }

            if (key >= arr[low]) {
                return low;
            }
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return closestBinarySearch(arr, key, low, middle);
        } else if (arr[middle] < key) {
            return closestBinarySearch(arr, key, middle, high);
        } else {
            return middle;
        }
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
