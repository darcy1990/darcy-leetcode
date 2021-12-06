import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/13 5:49 下午
 */
public class ReorderListTest {

    @Test
    public void reorderList() {
        ReorderList r = new ReorderList();
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);
        a.next.next.next.next.next = new ListNode(6);
        a.next.next.next.next.next.next = new ListNode(7);
        r.reorderList(a);
    }
}