package list;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 10:47 上午
 */
public class ListNodeUtils {

    public static ListNode buildListNode(int[] arr) {
        ListNode pre = new ListNode();
        ListNode p = pre;
        for (int i = 0; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }

        return pre.next;
    }

    public static void print(ListNode head) {
       while (head != null) {
           System.out.print(head.val + " ");
           head = head.next;
       }
    }
}
