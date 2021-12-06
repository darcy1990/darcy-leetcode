/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 10:12 上午
 */
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode rHead = null;

        ListNode p = head;
        ListNode nHead = p;
        ListNode tail = new ListNode();
        int c = 0;
        for (; c < k; c++) {
            if (c == k - 1) {
                // return first group head
                if (rHead == null) {
                    rHead = nHead;
                }

                // append to last group tail
                tail.next = nHead;
                // new last group tail
                tail = p;
                // next group
                p = p.next;
                nHead = p;

                c = 0;

            }

            if (p == null || p.next == null) {
                break;
            }
            ListNode nn = p.next.next;
            ListNode n = p.next;
            n.next = nHead;
            p.next = nn;
            nHead = n;
        }

        // re-reverse last <k group
        if (c > 0) {
            p = nHead;
            for (;p.next != null;) {
                ListNode nn = p.next.next;
                ListNode n = p.next;
                n.next = nHead;
                nHead = n;
                p.next = nn;
            }
        }

        return rHead;
    }
}
