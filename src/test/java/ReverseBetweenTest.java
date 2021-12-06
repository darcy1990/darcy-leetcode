import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/30 6:45 下午
 */
public class ReverseBetweenTest {

    @Test
    public void reverseBetween() {
        ReverseBetween rb = new ReverseBetween();
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);
        rb.reverseBetween(ln, 1, 4);
    }
}