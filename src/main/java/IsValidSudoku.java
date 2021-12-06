/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/25 5:44 下午
 */
public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int v = board[i][j] - '0' - 1;
                if (row[v][i]) {
                    return false;
                }

                if (column[v][j]) {
                    return false;
                }

                int blockNo = getBlockNo(i, j);
                if (block[v][blockNo]) {
                    return false;
                }

                row[v][i] = true;
                column[v][j] = true;
                block[v][blockNo] = true;
            }
        }

        return true;
    }

    private int getBlockNo(int i, int j) {
        return (i / 3) * 3 + j / 3;
    }
}
