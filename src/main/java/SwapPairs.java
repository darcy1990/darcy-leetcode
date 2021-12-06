/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/27 5:30 下午
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = new ListNode();
        p.next = head;
        while (p.next != null && p.next.next != null) {
            ListNode n = p.next;
            p.next = p.next.next;
            n.next = p.next.next;
            p.next.next = n;

            if (p.next.next == head) {
                head = p.next;
            }
            p = p.next.next;
        }

        return head;
    }
}
