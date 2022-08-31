package dp;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0 || points.length == 1) {
            return points.length;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] >= 0 && o2[0] < 0) {
                    return 1;
                }
                if (o1[0] < 0 && o2[0] >= 0) {
                    return -1;
                }
                return o1[0] - o2[0];
            }
        });
        int c = 0;
        int left = points[0][0];
        int right = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (right >= points[i][0]) {
                left = Math.max(left, points[i][0]);
                right = Math.min(right, points[i][1]);
            } else {
                c++;
                left = points[i][0];
                right = points[i][1];
            }
        }
        return ++c;
    }
}
