package array;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/23 4:01 下午
 */
public class Find132pattern {

    private List<Interval> intervals = new ArrayList<>();

    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int left = 0;
        int top = 0;
        for (int i = 1; i < nums.length; i++) {
            for (Interval interval : intervals) {
                if (interval.in(nums[i])) {
                    return true;
                }
            }
            if (nums[i] > nums[top]) {
                top = i;
            } else if (nums[i] < nums[top]) {
                intervals.add(new Interval(nums[left], nums[top]));
                Collections.sort(intervals, new Comparator<Interval>() {
                    @Override
                    public int compare(Interval o1, Interval o2) {
                        return o1.getStart() > o2.getStart() ? 1 : -1;
                    }
                });
                mergeIntervals();

                for (Interval interval : intervals) {
                    if (interval.in(nums[i])) {
                        return true;
                    }
                }

                left = i;
                top = i;
            }
        }

        return false;
    }

    private void mergeIntervals() {
        int[][] arrs = new int[intervals.size()][2];
        for (int i = 0; i < intervals.size(); i++) {
            arrs[i][0] = intervals.get(i).getStart();
            arrs[i][1] = intervals.get(i).getEnd();
        }

        int[][] mergedArray = merge(arrs, 0, arrs.length - 1);
        intervals.clear();
        for (int i = 0; i < mergedArray.length; i++) {
            intervals.add(new Interval(mergedArray[i][0], mergedArray[i][1]));
        }
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

    private class Interval {

        private int start;

        private int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean in(int k) {
            return k > start && k < end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
