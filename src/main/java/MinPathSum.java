/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/26 6:05 下午
 */
public class MinPathSum {

    public int minPathSum(int[][] grid) {
        int w = grid.length;
        int h = grid[0].length;
        int[][] s = new int[w][h];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (i == 0 && j == 0) {
                    s[i][j] = grid[0][0];
                    continue;
                }
                if (i == 0) {
                    s[i][j] = s[i][j - 1] + grid[i][j];
                    continue;
                }
                if (j == 0) {
                    s[i][j] = s[i - 1][j] + grid[i][j];
                    continue;
                }
                s[i][j] = Math.min(s[i - 1][j], s[i][j - 1]) + grid[i][j];
            }
        }

        return s[w - 1][h - 1];
    }
}
