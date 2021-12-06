import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/9 6:07 下午
 */
public class ReversePrint {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode h = head;
        while (h != null) {
            s.push(h.val);
            h = h.next;
        }

        int[] ans = new int[s.size()];
        int i = 0;
        while (!s.isEmpty()) ans[i++] = s.pop();

        return ans;
    }
}
