import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/21 10:03 上午
 */
public class CombinationSum2 {

    private int[] candidates;

    private Set<Integer> set = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        return combinationSum(target, new ArrayList<>(), 0);
    }

    public List<List<Integer>> combinationSum(int target, List<Integer> prefix, int i) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int j = i; j < candidates.length; j++) {
            int c = candidates[j];
            if (c > target) {
                break;
            }

            if (c == target) {
                List<Integer> p = new ArrayList<>(prefix);
                p.add(c);

                Collections.sort(p);

                Integer s = 0;
                for (int k = 0; k < p.size(); k++) {
                    s += s * 10 + p.get(k);
                }

                if (set.contains(s)) {
                    continue;
                } else {
                    set.add(s);
                }

                ret.add(p);
                continue;
            }

            List<Integer> p = new ArrayList<>(prefix);
            p.add(c);
            ret.addAll(combinationSum(target - c, p, j + 1));
        }

        return ret;
    }
}
