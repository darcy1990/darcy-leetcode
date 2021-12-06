/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/9 6:17 下午
 */
public class DivingBoard {

    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{};
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] r = new int[k + 1];
        for(int i = 0; i <= k; i++) {
            r[i] = shorter * (k - i) + longer * i;
        }

        return r;
    }
}
