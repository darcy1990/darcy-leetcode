import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/11 5:40 下午
 */
public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> r = new ArrayList<>();

        int width = matrix[0].length;
        int length = matrix.length;
        int[][] bit = new int[length][width];
        int size = length * width;
        // 0 -> right, 1-> down 2-> left 3 -> up
        int direct = 0;
        int i = 0, j = -1;
        while (r.size() < size) {
            if (direct == 0) {
                j++; // move to next
                for (; j < width; j++) {
                    if (bit[i][j] == 0) {
                        r.add(matrix[i][j]);
                        bit[i][j] = 1;
                    } else {
                        direct = 1;
                        break;
                    }
                }
                direct = 1;
                j--; // back off
            } else if (direct == 1) {
                i++;
                for (; i < length; i++) {
                    if (bit[i][j] == 0) {
                        r.add(matrix[i][j]);
                        bit[i][j] = 1;
                    } else {
                        direct = 2;
                        break;
                    }
                }
                direct = 2;
                i--;
            } else if (direct == 2) {
                j--;
                for (; j >= 0; j--) {
                    if (bit[i][j] == 0) {
                        r.add(matrix[i][j]);
                        bit[i][j] = 1;
                    } else {
                        direct = 3;
                        break;
                    }
                }
                direct = 3;
                j++;
            } else if (direct == 3) {
                i--;
                for (; i >= 0; i--) {
                    if (bit[i][j] == 0) {
                        r.add(matrix[i][j]);
                        bit[i][j] = 1;
                    } else {
                        direct = 0;
                        break;
                    }
                }

                direct = 0;
                i++;
            }
        }

        return r;
    }
}
