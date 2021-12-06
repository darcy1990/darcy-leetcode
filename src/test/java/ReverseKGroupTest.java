import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 10:46 上午
 */
public class ReverseKGroupTest {

    @Test
    public void reverseKGroup() {
        ReverseKGroup rkg = new ReverseKGroup();
        ListNode l = rkg.reverseKGroup(ListNodeUtils.buildListNode(new int[]{1,2,3,4,5,6,7,8,9}), 8);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}