

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/21 6:34 下午
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (freq.containsKey(key)) {
                int c = freq.get(key);
                freq.put(key, ++c);
            } else {
                freq.put(key, 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(k, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.add(entry);
        }

        int[] ret = new int[k];
        int i = 0;
        while (!pq.isEmpty() && i < k) {
            Map.Entry<Integer, Integer> e = pq.poll();
            ret[i++] = e.getKey();
        }

        return ret;
    }
}
