package list;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        while (p.next != null) {
            if (p.next.val >= p.val) {
                p = p.next;
                continue;
            }

            ListNode insert = p.next;
            p.next = p.next.next;
            insert.next = null;

            ListNode q = dummy;
            while (q.next != null) {
                if (q.next.val <= insert.val) {
                    q = q.next;
                    continue;
                }

                ListNode t = q.next;
                q.next = insert;
                insert.next = t;
                break;
            }
        }

        return dummy.next;
    }
}
