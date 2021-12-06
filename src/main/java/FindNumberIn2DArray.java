/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/12 12:57 下午
 */
public class FindNumberIn2DArray {

    private int h;

    private int w;

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        this.h = matrix.length;
        if (h == 0) {
            return false;
        }

        this.w = matrix[0].length;
        if (w == 0) {
            return false;
        }

        if (matrix[0][0] > target) {
            return false;
        }

        return findNumberIn2DArray(matrix, target, 0, w - 1);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target, int m, int n) {
        if (m == h - 1) {
            return recursionBinarySearch(matrix[m], target, 0, w - 1) >= 0;
        }

        if (n == 0) {
            int[] a = new int[h];
            for (int i = 0; i < h; i++) {
                a[i] = matrix[i][0];
            }
            return recursionBinarySearch(a, target, 0, h - 1) >= 0;
        }
        int i = m;
        int j = 0;

        while (j <= n && matrix[i][j] <= target) j++;
        // back
        j = j > 0 ? --j : j;

        while (i < h - 1 && matrix[i][j] < target) i++;


        if (matrix[i][j] == target) return true;

        return findNumberIn2DArray(matrix, target, i, j);
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
