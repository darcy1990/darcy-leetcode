package list;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/8 5:59 下午
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = new ListNode();
        p.val = head.val - 1;
        p.next = head;
        ListNode p1 = p;
        ListNode p2 = p1.next;
        int s = p1.val;
        int step = 0;
        boolean flag = false;
        while (p2 != null) {
            if (p2.val != s) {
                if (flag) {
                    p1.next = p2;
                    s = p2.val;
                    p2 = p2.next;
                    flag = false;
                    continue;
                } else {
                    s = p2.val;
                    step ++;
                    if (step >= 2) {
                        p1 = p1.next;
                        step = 1;
                    }
                }
            } else {
                flag = true;
            }

            p2 = p2.next;
        }

        if (flag) {
            p1.next = null;
        }

        return p.next;
    }
}
