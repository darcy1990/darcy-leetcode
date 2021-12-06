/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/11 8:59 下午
 */
public class Candy2 {

    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] r = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0 || ratings[i] == ratings[i - 1]) {
                r[i] = 1;
                continue;
            }
            r[i] = ratings[i] > ratings[i - 1] ? r[i - 1] + 1 : Math.min((r[i - 1] - 1), 1);
        }

        for (int i = 0; i < len; i++) {
            if (r[i] <= 0 && (i == len - 1 || r[i] < r[i + 1])) {
                r[i] = 1;
                for (int j = i - 1; j >= 0 && ratings[j] > ratings[j + 1]; j--) {
                    r[j] = Math.max(r[j], r[j + 1] + 1);
                }

                int j = i + 1;
                for (; j < len && ratings[j] > ratings[j - 1]; j++) {
                    r[j] = Math.max(r[j], r[j - 1] + 1);
                }

                i = j - 1;
            }
        }

        int s = 0;
        for (int i = 0; i < len; i++) {
            s += r[i];
        }

        return s;
    }
}
