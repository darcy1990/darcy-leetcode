package dp.prefix;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/30 4:16 下午
 */
public class NumSubmatrixSumTarget {

    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] col = new int[m][n];
        for (int j = 0; j < n; j++) {
            int s = 0;
            for (int i = 0; i < m; i++) {
                s += matrix[i][j];
                col[i][j] = s;
            }
        }

        int ans = 0;
        for (int i = -1; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += col[j][k] - (i >= 0 ? col[i][k] : 0);

                    if (map.containsKey(sum - target)) {
                        ans += map.get(sum - target);
                    }


                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        return ans;
    }
}
