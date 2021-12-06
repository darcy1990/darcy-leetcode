/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/30 6:26 下午
 */
public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int p = 1;
        ListNode n = head;
        ListNode mTail = null;
        ListNode pre =  null;
        if (left == 1) {
            pre = new ListNode();
            pre.next = head;
        }
        while (n != null) {
            if (p == left - 1) {
                pre = n;
            }
            if (p == left) {
                mTail = n;
            }
            if (p > left && p <= right) {
                ListNode next = n.next;
                ListNode mHead = pre.next;
                pre.next = n;
                n.next = mHead;
                mTail.next = next;
                n = mTail;
            }

            if (p > right) {
                break;
            }

            n = n.next;
            p++;
        }

        return left == 1 ? pre.next : head;
    }
}
