import java.util.PriorityQueue;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/3 5:39 下午
 */
public class SmallestK {

    public int[] smallestK(int[] arr, int k) {
        if (k == 0) {
            return new int[]{};
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)->o2.compareTo(o1));
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if (queue.size() < k) {
                queue.add(c);
            } else {
                int max = queue.peek();
                if (c < max) {
                    queue.poll();
                    queue.add(c);
                }
            }

        }

        int[] ans = new int[k];
        int i = 0;
        while (!queue.isEmpty()) {
            ans[i++] = queue.poll();
        }

        return ans;
    }
}
