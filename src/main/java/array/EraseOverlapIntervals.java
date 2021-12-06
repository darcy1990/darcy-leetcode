package array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/13 5:53 下午
 */
public class EraseOverlapIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        int[] last = intervals[0];
        int c = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] == last[0]) {
                c++;
                continue;
            }

            // overlap
            if (last[1] > interval[0]) {
                // contain
                if (last[1] > interval[1]) {
                    last = interval;
                    c++;
                    continue;
                }
                c++;
                continue;
            }
            last = interval;
        }

        return c;
    }
}
