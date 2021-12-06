/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 5:35 下午
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] t = new int[len];
        int[] r = new int[len];
        System.arraycopy(temperatures, 0, t, 0, len);
        int p1 = 0;
        for (int i = 1; i < t.length; i++) {
            // decrease
            if (t[i - 1] >= t[i]) {
                continue;
            } else {
                int j = i - 1;
                for (; j >= p1; j--) {
                    // already cal
                    if (r[j] > 0) {
                        continue;
                    }

                    if (t[j] < t[i]) {
                        r[j] = i - j;
                    } else {
                        break;
                    }

                    // loop end
                    if (j == p1) {
                        p1 = i;
                        break;
                    }
                }
            }
        }

        return r;
    }
}
