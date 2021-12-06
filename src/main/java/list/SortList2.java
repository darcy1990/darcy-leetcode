package list;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/17 3:23 下午
 */
public class SortList2 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode pre = head;
        while (p2 != null && p2.next != null) {
            pre = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode nHead = p1;
        pre.next = null;

        head = sortList(head);
        nHead = sortList(nHead);

        ListNode k1 = head;
        ListNode k2 = nHead;
        ListNode p = new ListNode();
        ListNode h = p;
        while (k1 != null || k2 != null) {
            if (k1 == null) {
                p.next = k2;
                break;
            }
            if (k2 == null) {
                p.next = k1;
                break;
            }
            if (k1.val <= k2.val) {
                p.next = k1;
                k1 = k1.next;
            } else if (k1.val > k2.val) {
                p.next = k2;
                k2 = k2.next;
            }

            p = p.next;
        }

        return h.next;
    }
}
