import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/22 1:35 下午
 */
public class CanMeasureWater {

    private Set<Integer> set = new HashSet<>();

    private int m;

    private int n;

    private int z;

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        this.m = x <= y ? x : y;
        this.n = x <= y ? y : x;
        this.z = z;

        dfs(0, 0);

        for (int i = 0; i <= m; i++) {
            int j = z - i;
            if (j <= n && j >= 0 && set.contains(i * 100000 + j)) {
                return true;
            }
        }

        return false;
    }

    private void dfs(int a, int b) {
        // already dfs
        if (set.contains(a * 100000 + b)) {
            return;
        }
        if (!set.contains(a + " " + b)) {
            set.add(a * 100000 + b);
        }
        dfs(0, b);
        dfs(a, 0);
        dfs(m, b);
        dfs(a, n);
        if (a + b <= m) {
            dfs(a + b, 0);
            dfs(0, a + b);
        } else if (a + b > m && a + b <= n) {
            dfs(m, a + b - m);
            dfs(0, a + b);
        } else if (a + b > n) {
            dfs(m, a + b - m);
            dfs(a + b - n, n);
        }
    }
}
