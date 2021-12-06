import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/2 5:35 下午
 */
public class MyPow {

    private Map<Integer, Double> map = new HashMap<>();

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (x == 1.0) {
            return 1.0;
        }

        if (x == -1.0) {
            return n % 2 == 0 ? 1 : -1;
        }

        if (n > 2) {
            int k = n % 2;
            double half = map.get(n / 2) != null ? map.get(n / 2) : myPow(x, n / 2);
            return half * half * myPow(x, k);
        }

        int a = Math.abs(n);
        double r = 1.0;
        do {
            r *= x;
            a--;
        } while (a > 0);

        double v = n > 0 ? r : 1 / r;
        map.put(n, v);
        return v;
    }
}
