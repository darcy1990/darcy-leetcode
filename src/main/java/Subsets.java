import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/11 5:47 下午
 */
public class Subsets {

    private Map<Integer, Integer> freq = new HashMap<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (freq.containsKey(n)) {
                int f = freq.get(n);
                freq.put(n, f + 1);
            } else {
                freq.put(n, 1);
            }
        }
        return subsets(nums, 0, new ArrayList<>());
    }

    private List<List<Integer>> subsets(int[] nums, int i, List<Integer> prefix) {
        List<List<Integer>> ret = new ArrayList<>();
        if (i >= nums.length) {
            List<Integer> p = new ArrayList<>();
            p.addAll(prefix);
            ret.add(p);
            return ret;
        }

        int f = freq.get(nums[i]);
        for (int j = 0; j <= f ; j++) {
            List<Integer> p = new ArrayList<>();
            p.addAll(prefix);
            for (int k = 1; k <= j; k++) {
                p.add(nums[i]);
            }
            ret.addAll(subsets(nums, i + f, p));
        }
        return ret;
    }
}
