import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/8 6:20 下午
 */
public class DeleteDuplicatesTest {

    @Test
    public void deleteDuplicates() {
        DeleteDuplicates2 dd = new DeleteDuplicates2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        dd.deleteDuplicates(head);
    }
}