import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/20 4:32 下午
 */
public class CombinationSum {

    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        return combinationSum(target, new ArrayList<>(), 0);
    }

    public List<List<Integer>> combinationSum(int target, List<Integer> prefix, int i) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int j = i; j < candidates.length; j++) {
            int c = candidates[j];
            if (c > target) {
                continue;
            }

            if (c == target) {
                List<Integer> p = new ArrayList<>(prefix);
                p.add(c);
                ret.add(p);
                continue;
            }

            List<Integer> p = new ArrayList<>(prefix);
            p.add(c);
            ret.addAll(combinationSum(target - c, p, j));
        }

        return ret;
    }
}
