package dp.mem;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/27 9:25 下午
 */
public class IntegerReplacement {

    private Map<Integer, Integer> map = new HashMap<>();

    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == Integer.MAX_VALUE) {
            return 32;
        }
        map.put(1, 0);
        return replace(n);
    }

    public int replace(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ans = 0;
        if (n % 2 == 0) {
            ans = replace(n / 2) + 1;
        } else {
            ans = Math.min(replace(n + 1), replace(n - 1)) + 1;
        }

        map.put(n, ans);

        return ans;
    }
}
