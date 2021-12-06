import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/16 11:38 上午
 */
public class SolveSudokuTest {

    @Test
    public void solveSudoku() {
        SolveSudoku ss = new SolveSudoku();
        ss.solveSudoku(new char[][]
                {
                        {'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}}
                );
    }
}