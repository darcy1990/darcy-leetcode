package array;

import org.junit.Test;

public class SearchMatrixTest {

    @Test
    public void searchMatrix() {
        SearchMatrix sm = new SearchMatrix();
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        for (int i = 0; i < 30; i++) {
            System.out.println(i + " " + sm.searchMatrix(matrix, i));
        }
    }

}