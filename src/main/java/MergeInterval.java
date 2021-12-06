import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/11 4:00 下午
 */
public class MergeInterval {

    public int[][] merge(int[][] intervals) {
        return merge(intervals, 0, intervals.length - 1);
    }

    private int[][] merge(int[][] intervals, int from, int to) {
        if (from == to) {
            return new int[][]{intervals[from]};
        }
        int mid = (to + from) / 2;
        int[][] left = merge(intervals, from, mid);
        int[][] right = merge(intervals, mid + 1, to);
        int[][] arr = new int[left.length + right.length][];
        System.arraycopy(left, 0, arr, 0, left.length);
        System.arraycopy(right, 0, arr, left.length, right.length);
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        int s = arr[0][0];
        int e = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= e) {
                e = arr[i][1] > e ? arr[i][1] : e;
            } else {
                pairs.add(new Pair<>(s, e));
                s = arr[i][0];
                e = arr[i][1];
            }
        }
        pairs.add(new Pair<>(s, e));

        int[][] r = new int[pairs.size()][];
        for (int i = 0; i < pairs.size(); i++) {
            r[i] = new int[]{pairs.get(i).getKey(), pairs.get(i).getValue()};
        }

        return r;
    }
}
