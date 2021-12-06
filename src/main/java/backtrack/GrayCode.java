package backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/25 5:39 下午
 */
public class GrayCode {

    public List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> ans = new ArrayList<>();
            ans.add(0);
            return ans;
        }
        List<Integer> g = grayCode(n - 1);
        List<Integer> ans = new ArrayList<>(g.size() * 2);
        for (int i = 0; i < g.size(); i++) {
            ans.add(g.get(i) << 1);
        }
        for (int i = g.size() - 1; i >= 0; i--) {
            ans.add((g.get(i) << 1) + 1);
        }

        return ans;
    }
}
