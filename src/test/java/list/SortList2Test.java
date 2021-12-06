package list;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/17 5:28 下午
 */
public class SortList2Test {

    @Test
    public void sortList() {
        SortList2 s = new SortList2();
        ListNode l = new ListNode(-1);
        l.next = new ListNode(5);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(0);
        s.sortList(l);
    }
}