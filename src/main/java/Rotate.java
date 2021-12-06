/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/28 5:18 下午
 */
public class Rotate {

    private int[][] matrix;

    public void rotate(int[][] matrix) {
        this.matrix = matrix;
        if (matrix.length <= 1) {
            return;
        }

        int len = matrix.length;
        int i = 0;
        int j = 0;
        while( i < matrix.length && j < matrix[0].length && len > 0) {
            rotate(i, j, len);
            i++;
            j++;
            len = len - 2;
        }
    }

    private void rotate(int i, int j, int len) {
        int s = len -1;
        int[] upper = new int[s];
        for (int k = 0; k < s; k++) {
            upper[k] = matrix[i][j + k];
        }

        // left -> uppper
        int l = s;
        for (int k = 0; k < s; k++, l--) {
            matrix[i][j + k] = matrix[i + l][j];
        }

        int d = s;
        // down -> left
        for (int k = s; k > 0; k--, d--) {
            matrix[i + k][j] = matrix[i + s][j + d];
        }

        // right -> down
        int r = 0;
        for (int k = s; k > 0; k--, r++) {
            matrix[i + s][j + k] = matrix[i + r][j + s];
        }

        // upper -> right
        int u = 0;
        for (int k = 0; k < s; k++, u++) {
            matrix[i + k][j + s] = upper[u];
        }

    }

//    public static void printMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("------------------------");
//    }
}
