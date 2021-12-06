/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/7 6:18 下午
 */
public class MySqrt {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        Integer a = 1;

        int len = (x + "").length();

        int m = 1;
        int i = (len - 1) / 2;
        while (i-- > 0) m *= 10;
        int n = m * 10 >= 46340 ? 46340 : m * 10;

        while (m + 1 < n) {
            int k = (m + n) / 2;
            // overflow
            int muti = k * k;
            if (muti < x) {
                m = k;
            } else if (muti == x) {
                return k;
            }else {
                n = k;
            }
        }

        if (n * n <= x) {
            return n;
        }

        return m;
    }
}
