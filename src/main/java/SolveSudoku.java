/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/15 6:08 下午
 */
public class SolveSudoku {

    private char[][] board;
    private boolean[][] rows;
    private boolean[][] cols;
    private boolean[][] blocks;
    private int[] rs;

    public void solveSudoku(char[][] board) {
        this.board = board;
        rows = new boolean[9][9];
        cols = new boolean[9][9];
        blocks = new boolean[9][9];
        rs = new int[27];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char c1 = board[i][j];
                if (c1 != '.') {
                    int c = board[i][j] - '1';
                    rows[i][c] = true;
                    rs[i]++;
                    cols[j][c] = true;
                    rs[9 + j]++;
                    int b = block(i, j);
                    blocks[b][c] = true;
                    rs[18 + b]++;
                }
            }
        }

        dfs();

        // System.out.println(JSONObject.toJSONString(board));
    }

    private boolean dfs() {
        int max = 0;
        int k = 0;
        for (int i = 0; i < rs.length; i++) {
            if (rs[i] > max && rs[i] != 9) {
                max = rs[i];
                k = i;
            }
        }

        if (max == 0) {
            return true;
        }

        if (k < 9) {
            for (int i = 0; i < 9; i++) {
                if (board[k][i] == '.') {
                    for (int j = 0; j < 9; j++) {
                        if (!rows[k][j] && !cols[i][j] && !blocks[block(k, i)][j]) {
                            fill(k, i, j);

                            boolean ret = dfs();
                            if (ret) {
                                return true;
                            }

                            clear(k, i);
                        }
                    }
                    // if can not fill any j into board[k][i], bad try
                    return false;
                }
            }
        } else if (k < 18) {
            k = k - 9;
            for (int i = 0; i < 9; i++) {
                if (board[i][k] == '.') {
                    for (int j = 0; j < 9; j++) {
                        if (!cols[k][j] && !rows[i][j] && !blocks[block(i, k)][j]) {
                            fill(i, k, j);

                            boolean ret = dfs();
                            if (ret) {
                                return true;
                            }

                            clear(i, k);
                        }
                    }
                    return false;
                }
            }
        } else {
            k = k - 18;
            int m = k / 3 * 3;
            int n = (k - m) * 3;
            for (int i = m; i < m + 3; i++) {
                for (int j = n; j < n + 3; j++) {
                    if (board[i][j] == '.') {
                        for (int b = 0; b < 9; b++) {
                            if (!blocks[k][b] && !rows[i][b] && !cols[j][b]) {
                                fill(i, j, b);

                                boolean ret = dfs();
                                if (ret) {
                                    return true;
                                }

                                clear(i, j);
                            }
                        }

                        return false;
                    }
                }
            }
        }

        return false;
    }

    private void fill(int m, int n, int c) {
        // System.out.println("fill " + (m + 1) + " " + (n + 1) + " " + (char)(c + '1'));
        board[m][n] = (char)(c + '1');
        rows[m][c] = true;
        rs[m]++;
        cols[n][c] = true;
        rs[n + 9]++;
        blocks[block(m, n)][c] = true;
        rs[block(m, n) + 18]++;
    }

    private void clear(int m, int n) {
        // System.out.println("clear " + (m + 1) + " " + (n + 1));
        char c1 = board[m][n];
        int c = c1 - '1';
        board[m][n] = '.';
        rows[m][c] = false;
        rs[m]--;
        cols[n][c] = false;
        rs[n + 9]--;
        blocks[block(m, n)][c] = false;
        rs[block(m, n) + 18]--;
    }

    private int block(int m, int n) {
        return m / 3 * 3 + n / 3;
    }
}
