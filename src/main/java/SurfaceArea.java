/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/23 2:43 下午
 */
public class SurfaceArea {

    public int surfaceArea(int[][] grid) {
        int sf = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    sf += 2;
                }

                int v = grid[i][j];
                if (i == 0) {
                    sf += v;
                } else {
                    int u = grid[i - 1][j];
                    if (u < v) {
                        sf += v -u;
                    }
                }

                if (i == grid.length - 1) {
                    sf += v;
                } else {

                    int d = grid[i + 1][j];
                    if (d < v) {
                        sf += v - d;
                    }
                }

                if (j == 0) {
                    sf += v;
                } else {
                    int l = grid[i][j - 1];
                    if (l < v) {
                        sf += v - l;
                    }
                }

                if (j == grid[i].length - 1) {
                    sf += v;
                } else {
                    int r = grid[i][j + 1];
                    if (r < v) {
                        sf += v - r;
                    }
                }
            }
        }

        return sf;
    }
}
