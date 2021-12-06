import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/17 3:54 下午
 */
public class SolveNQueens {

    private List<List<String>> ret;
    private boolean[] rows;
    private boolean[] cols;
    private boolean[] se;
    private boolean[] ne;
    private int n;
    private boolean[][] checkerboard;

    public List<List<String>> solveNQueens(int n) {
        ret = new ArrayList<>();
        rows = new boolean[n];
        cols = new boolean[n];
        se = new boolean[2 * n - 1];
        ne = new boolean[2 * n - 1];
        this.n = n;
        checkerboard = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            solve(0, i);
        }

        return ret;
    }

    private void solve(int p, int q) {
        if (cols[q] || se[se(p, q)] || ne[ne(p, q)]) {
            return;
        }

        fill(p, q);

        if (p == n - 1) {
            addSolution();
        } else {
            int p1 = p + 1;
            for (int i = 0; i < n; i++) {
                solve(p1, i);
            }
        }

        clear(p, q);
    }

    private void addSolution() {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder l = new StringBuilder();
            for (int j = 0; j < n; j++) {
                l.append(checkerboard[i][j] ? "Q" : ".");
            }
            lines.add(l.toString());
        }

        ret.add(lines);
    }


    private void fill(int i, int j) {
        rows[i] = true;
        cols[j] = true;
        se[se(i, j)] = true;
        ne[ne(i, j)] = true;
        checkerboard[i][j] = true;
    }

    private void clear(int i, int j) {
        rows[i] = false;
        cols[j] = false;
        se[se(i, j)] = false;
        ne[ne(i, j)] = false;
        checkerboard[i][j] = false;
    }

    private int se(int i, int j) {
        return n - j - 1 + i;
    }

    private int ne(int i, int j) {
        return i + j;
    }
}
