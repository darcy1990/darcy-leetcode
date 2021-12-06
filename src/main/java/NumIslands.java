/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 2:08 下午
 */
public class NumIslands {

    private char[][] bit;

    private int h;

    private int w;

    public int numIslands(char[][] grid) {
        w = grid[0].length;
        h = grid.length;
        bit = new char[h][w];
        for (int i = 0; i < h; i++) {
            System.arraycopy(grid[i], 0, bit[i], 0, w);
        }

        int c = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (bit[i][j] == '1') {
                    c++;
                    bfs(i, j);
                }
            }
        }

        return c;
    }

    private void bfs(int i, int j) {
        if (i < 0 || i >= h || j < 0 || j >= w) {
            return;
        }

        if (bit[i][j] == '0') {
            return;
        }

        bit[i][j] = '0';
        bfs(i - 1, j);
        bfs(i + 1, j);
        bfs(i, j -1);
        bfs(i, j + 1);
    }
}
