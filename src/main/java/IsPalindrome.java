/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 3:56 下午
 */
public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        int c = 0;
        ListNode p1 = head;
        while (p1 != null) {
            c++;
            p1 = p1.next;
        }

        int arr[] = new int[c];
        ListNode p2 = head;
        int i = 0;
        while (p2 != null) {
            arr[i++] = p2.val;
            p2 = p2.next;
        }

        for (int j = 0; j < c /2; j++) {
            if (arr[j] != arr[c - 1 - j]) {
                return false;
            }
        }

        return true;
    }
}
