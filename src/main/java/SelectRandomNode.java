import java.util.Random;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/22 6:26 下午
 */
public class SelectRandomNode {

    private Random r = new Random(47);

    private int[] reservoir = new int[1];

    private ListNode head;

    public SelectRandomNode(ListNode head) {
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        if (head.next == null) {
            return head.val;
        }
        reservoir[0] = head.val;
        ListNode next = head.next;
        for (int i = 1; next != null; i++) {
            int d = r.nextInt(i + 1);
            if (d < 1) {
                reservoir[d] = next.val;
            }

            next = next.next;
        }

        return reservoir[0];
    }


}
