import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/15 5:41 下午
 */
public class MaxSlidingWindow {

    private int size;

    public int[] maxSlidingWindow(int[] nums, int k) {
        size = k / 10;
        if (size == 0) {
            size = k > 3 ? 3 : 1;
        }

        // 小根
        PriorityQueue<Integer> p = new PriorityQueue<>(size);

        // 大根
        PriorityQueue<Integer> q = new PriorityQueue<>(size, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            add(nums, p, q, i);
        }
        ans[0] = q.peek();
        for (int i = k; i < nums.length; i++) {
            if (q.contains(nums[i - k])) {
                q.remove(nums[i - k]);
                p.remove(nums[i - k]);
            }

            if (p.isEmpty()) {
                for (int j = i - 1; j > i - k; j--) {
                    add(nums, p, q, j);
                }
            }

            add(nums, p, q, i);
            ans[i - k + 1] = q.peek();
        }

        return ans;
    }

    private void add(int[] nums, PriorityQueue<Integer> p, PriorityQueue<Integer> q, int i) {
        int min = p.isEmpty() ? Integer.MIN_VALUE : p.peek();
        if (nums[i] > min) {
            q.add(nums[i]);
            p.add(nums[i]);
            if (p.size() > size) {
                int c = p.poll();
                q.remove(c);
            }
        }
    }
}
