package list;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/24 8:18 下午
 */
public class RotateRightTest {

    @Test
    public void rotateRight() {
        RotateRight r = new RotateRight();
        ListNode head = ListNodeUtils.buildListNode(new int[]{0, 1, 2});
        ListNode ans = r.rotateRight(head, 4);
        ListNodeUtils.print(ans);
    }
}