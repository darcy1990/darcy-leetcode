import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/22 6:43 下午
 */
public class LexicalOrder {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<>();

        int len = (n + "").length();
        int[] arr = new int[len];
        Arrays.fill(arr, -1);
        int p = 0;
        arr[0] = 0;
        while (l.size() < n) {
            // back
            if (p >= len) {
                p--;
                continue;
            }

            // back
            if (arr[p] == 9) {
                arr[p] = -1;
                p--;
                continue;
            }
            arr[p] ++;
            int val = val(arr);
            if (val <= n) {
                l.add(val);
                p++;
            } else {
                // back
                arr[p] = -1;
                p--;
            }
        }

        return l;
    }

    private int val(int[] arr) {
        int v = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                break;
            }
            v = arr[i] + v * 10;
        }

        return v;
    }
}
