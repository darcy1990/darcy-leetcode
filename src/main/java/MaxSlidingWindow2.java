import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/15 5:41 下午
 */
public class MaxSlidingWindow2 {

    private int size;

    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            q.add(nums[i]);
        }
        ans[0] = q.peek();
        int s = 1;
        for (int i = k; i < nums.length; i++) {
            q.add(nums[i]);
            q.remove(nums[i - k]);
            ans[s++] = q.peek();
            // System.out.println(i + " " + nums[i] + " " + ans[s - 1]);
        }

        return ans;
    }
}
