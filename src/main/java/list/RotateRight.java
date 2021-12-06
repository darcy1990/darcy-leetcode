package list;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/24 7:39 下午
 */
public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        int len = 1;
        ListNode t = head;
        while (t != null && t.next != null) {
            len++;
            t = t.next;
        }

        if (len == 1) {
            return head;
        }

        int c = k % len;
        if (c == 0) {
            return head;
        }

        int m = len - c;

        ListNode pre = head;
        while (m > 1) {
            pre = pre.next;
            m--;
        }

        t.next = head;
        head = pre.next;
        pre.next = null;

        return head;
    }
}
