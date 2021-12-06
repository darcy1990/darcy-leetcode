/**
 * 2 * @Author: Zhongming Yuan
 * 3 * @Date: 2021/3/1 6:46 下午
 * 4
 */
public class IntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        int l1 = 0;
        int l2 = 0;
        while (p1 != null) {
            l1++;
            p1 = p1.next;
        }

        while (p2 != null) {
            l2++;
            p2 = p2.next;
        }

        p1 = headA;
        p2 = headB;
        if (l1 >= l2) {
            int k = l1 - l2;
            while (k > 0) {
                p1 = p1.next;
                k--;
            }
        } else {
            int k = l2 - l1;
            while (k > 0) {
                p2 = p2.next;
                k--;
            }
        }

        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return null;
    }
}
