/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/4 3:59 下午
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int a = m - 1;
        int b = n - 1;
        double d = 1.0;
        for (int i = b; i >= 1; i--) {
            d *= (double) (a + i) / i;
        }

        return (int)Math.round(d);
    }


}
