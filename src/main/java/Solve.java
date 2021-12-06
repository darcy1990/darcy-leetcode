/**
 * @Author: Zhongming Yuan
 * @Date: 2021/3/26 2:16 下午
 */
public class Solve {

    private boolean[][] excludes;

    public void solve(char[][] board) {
        int wid = board[0].length;
        int len = board.length;
        excludes = new boolean[len][wid];

        for (int i = 0; i < wid; i++) {
            find(board, 0, i);
        }

        for (int i = 0; i < wid; i++) {
            find(board, len - 1, i);
        }

        for (int i = 0; i < len; i++) {
            find(board, i, 0);
        }

        for (int i = 0; i < len; i++) {
            find(board, i, wid - 1);
        }

       for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && !excludes[i][j]) {
                    board[i][j] = 'X';
                }
           }
       }
    }

    private void find(char[][] board, int i, int j) {
        if (excludes[i][j]) {
            return;
        }

        if (board[i][j] == 'X') {
            return;
        }

        excludes[i][j] = true;

        if (i - 1 >= 0) {
            find(board, i - 1, j);
        }

        if (i + 1 < board.length) {
            find(board, i + 1, j);
        }

        if (j - 1 >= 0) {
            find(board, i , j - 1);
        }

        if (j + 1 < board[0].length) {
            find(board, i , j + 1);
        }
    }
}
