package array;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0 || intervals[0].length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        int left = maxBinarySearch(intervals, newInterval[0], 0, intervals.length - 1);
        int c = 0;
        int[] k = new int[2];
        System.arraycopy(newInterval, 0, k, 0, 2);
        for (int i = left; i < intervals.length; i++) {
            if ((k[0] <= intervals[i][0] && k[1] >= intervals[i][0]) || (intervals[i][0] <= k[0] && intervals[i][1] >= k[0])) {
                k = new int[]{Math.min(k[0], intervals[i][0]), Math.max(k[1], intervals[i][1])};
                c++;
            } else {
                if (i == left && intervals[i][0] <= k[0]) {
                    left++;
                    continue;
                }
                break;
            }
        }

        int[][] r = new int[intervals.length - c + 1][2];
        System.arraycopy(intervals, 0, r, 0, left);
        r[left] = k;
        System.arraycopy(intervals, left + c, r, left + 1, intervals.length - left  - c);

        return r;
    }

    public static int maxBinarySearch(int[][] arr, int key, int low, int high) {
        if (arr[arr.length - 1][0] < key) {
            return arr.length - 1;
        }
        if (low == high) {
            return low;
        }
        if (low + 1 == high) {
            if (arr[high][0] < key) {
                return high;
            }

            return low;
        }

        int middle = (low + high) / 2;
        if (arr[middle][0] > key) {
            return maxBinarySearch(arr, key, low, middle);
        } else if (arr[middle][0] < key) {
            return maxBinarySearch(arr, key, middle, high);
        } else {
            return middle;
        }
    }
}
