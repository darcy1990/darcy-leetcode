package array;

import java.util.Map;
import java.util.TreeMap;

public class SortArray {

    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                int c = map.get(n);
                map.put(n, ++c);
            } else {
                map.put(n, 1);
            }
        }

        int[] ret = new int[nums.length];
        int i = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            for (int j = 0; j < e.getValue(); j++) {
                ret[i++] = e.getKey();
            }
        }

        return ret;
    }
}
