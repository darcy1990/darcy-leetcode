package array;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/12/2 6:18 下午
 */
public class LargestRectangleArea {

    public int largestRectangleArea(int[] heights) {
        int[] lte = new int[heights.length];
        Arrays.fill(lte, -1);
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0 ; i--) {
            if (s.isEmpty()) {
                s.add(i);
                continue;
            }

            int h = s.peek();
            while (heights[h] >= heights[i]) {
                int c = s.pop();
                lte[c] = i;

                if (s.isEmpty()) {
                    break;
                }
                h = s.peek();
            }
            s.add(i);
        }

        int ans = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (i != heights.length - 1 && heights[i] <= heights[i + 1]) {
                continue;
            }

            int max = heights[i] * (i - lte[i]);
            int min = heights[i];
            int p = i;
            while (p >= 0) {
                min = lte[p] >= 0 ? Math.min(min, heights[lte[p]]) : min;
                int f = lte[p] >= 0 ? (lte[lte[p]] >= 0 ? (lte[lte[p]] + 1) : lte[p]) : 0;
                max = Math.max(max, (i - f + 1) * min);
                p = lte[p];
            }

            ans = Math.max(max, ans);
        }

        return ans;
    }
}
