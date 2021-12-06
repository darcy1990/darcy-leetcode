import java.util.TreeSet;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/25 2:12 下午
 */
public class ContainsNearbyAlmostDuplicate {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            Integer ceiling = set.ceiling(v - t);
            if (ceiling != null && ceiling <= v + t) {
                return true;
            }
            set.add(v);
            if (i >= k) {
                set.remove(nums[i -k]);
            }
        }

        return false;
    }
}
