import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargest {

    public static void main(String[] args) {
        FindKthLargest f = new FindKthLargest();
        f.findKthLargest(new int[]{3,8,3,7,2,12,5,5,6}, 2);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(k);

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (pq.size() > k - 1) {
                int top = pq.peek();
                if (n > top) {
                    pq.poll();
                    pq.add(n);
                }
            } else {
                pq.add(n);
            }
        }


        return pq.poll();
    }
}
