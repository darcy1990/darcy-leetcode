public class NemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        for (int k = n - 1; k > 0; k--) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }

        ListNode pre = null;
        for (; p2.next != null;) {
            pre = p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        if (pre == null) {
            // head
            head = head.next;
        } else if (pre.next.next == null) {
            // tail
            pre.next = null;
        } else {
            ListNode d = pre.next;
            pre.next = d.next;
            d = null;
        }

        return head;
    }
}
