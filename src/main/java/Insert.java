/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/27 3:26 下午
 */
public class Insert {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[] m = new int[intervals.length];
        int[] n = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            m[i] = intervals[i][0];
            m[i] = intervals[i][1];
        }

        int s = minBinarySearch(m, newInterval[0], 0, m.length - 1);
        int e = maxBinarySearch(n, newInterval[1], 0, m.length - 1);
        int len = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (i < s || i > e ) len++;
        }
        len++;

        int[][] ans = new int[len][2];
        int j = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (i < s || i > e) {
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
            } else {
                ans[j][0] = intervals[s][0] < newInterval[0] ? intervals[s][0] : newInterval[0];
                ans[j][1] = intervals[e][1] > newInterval[1] ? intervals[e][1] : newInterval[1];
            }
        }

        return ans;
    }

    public static int minBinarySearch(int[] arr, int key, int low, int high) {
        if (arr[0] > key) {
            return Integer.MIN_VALUE;
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
            return minBinarySearch(arr, key, low, middle);
        } else if (arr[middle] < key) {
            return minBinarySearch(arr, key, middle, high);
        } else {
            return middle;
        }
    }

    public static int maxBinarySearch(int[] arr, int key, int low, int high) {
        if (arr[arr.length - 1] < key) {
            return Integer.MAX_VALUE;
        }
        if (low == high) {
            return key <= arr[low] ? low : -1;
        }
        if (low + 1 == high) {
            if (key <= arr[high]) {
                return high;
            }

            if (key <= arr[low]) {
                return low;
            }
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return maxBinarySearch(arr, key, low, middle);
        } else if (arr[middle] < key) {
            return maxBinarySearch(arr, key, middle, high);
        } else {
            return middle;
        }
    }
}
