/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/13 5:22 下午
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        if (head.next == null) {
            return;
        }
        ListNode p1 = head;
        // mid
        ListNode p2 = head;
        ListNode pre = null;
        while (p1 != null && p1.next != null) {
            p1 = p1.next.next;
            pre = p2;
            p2 = p2.next;
        }

        // real mid
        if (p1 != null) {
            pre = p2;
            p2 = p2.next;
        }

        // two list
        pre.next = null;

        // reverse back list
        ListNode p4 = p2;
        ListNode bh = p2;
        while (p4.next != null) {
            ListNode n = p4.next;
            p4.next = p4.next.next;
            n.next = bh;
            bh = n;
        }

        // 交叉排序
        ListNode p3 = head;
        while (bh != null) {
            ListNode b = bh;
            bh = bh.next;

            b.next = null;
            ListNode f = p3.next;
            p3.next = b;
            b.next = f;
            p3 = f;
        }
    }
}
