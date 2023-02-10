package array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i + 1 || nums[i] == 0) {
                continue;
            }
            int c = i;
            int next = nums[c];
            nums[c] = 0; // reset
            while (next > 0 && nums[next - 1] != next) {
                int t = nums[next - 1];
                nums[next - 1] = next; // fix
                next = t;
            }
        }

        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                r.add(i + 1);
            }
        }

        return r;
    }
}
