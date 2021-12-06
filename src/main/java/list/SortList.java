package list;

/**
 * 2 * @Author: Zhongming Yuan
 * 3 * @Date: 2021/3/3 6:01 下午
 * 4
 */
public class SortList {

    public ListNode sortList(ListNode l) {
        ListNode head = l;
        ListNode tail = l;

        ListNode p = head;
        while (p.next != null) {
            ListNode c = tail.next;
            if (p.val <= c.val) {
                tail = tail.next;
            } else {
                tail.next = tail.next.next;
                c.next = head;
                head = c;
            }
        }

        return null;
    }
}
