package list;

import tree.TreeNode;

public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        return recrusive(head);
    }

    private TreeNode recrusive(ListNode head) {
        if (head == null) {
            return null;
        }
        // one node
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        // two node
        if (head.next.next == null) {
            TreeNode left = new TreeNode(head.val, null, null);
            TreeNode ans = new TreeNode(head.next.val, left, null);
            return ans;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode pre = null;
        while (p2 != null && p2.next != null) {
            pre = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }

        pre.next = null;

        TreeNode left = recrusive(head);
        TreeNode right = recrusive(p1.next);
        TreeNode ans = new TreeNode(p1.val, left, right);
        return ans;
    }
}
