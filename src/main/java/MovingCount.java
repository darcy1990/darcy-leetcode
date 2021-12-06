/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/28 4:46 下午
 */
public class MovingCount {

    private int m;

    private int n;

    private int k;

    private boolean[][] moved;

    private int[][] sum;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        moved = new boolean[m][n];
        sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = sum(i) + sum(j);
            }
        }

        dfs(0, 0);

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (moved[i][j]) ans++;
            }
        }

        return ans;
    }

    private void dfs(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        if (moved[i][j]) {
            return;
        }
        if (sum[i][j] > k) {
            return;
        }

        moved[i][j] = true;

        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i , j - 1);
    }

    private int sum(int key) {
        int k = key;
        int s = 0;
        while (k > 0) {
            s += k % 10;
            k = k / 10;
        }

        return s;
    }
}
