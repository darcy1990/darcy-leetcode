public class Test {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution s = new Solution();
        s.addTwoNumbers(l1, l2);
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

   static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode h1 = l1;
            ListNode h2 = l2;
            ListNode head = null;
            ListNode pre = null;
            int c = 0;
            while (h1 != null || h2 != null || c > 0) {
                int s = (h1 != null ? h1.val : 0 ) + (h2 != null ? h2.val : 0) + c;
                c =  s >= 10 ? 1 : 0;
                int h = s % 10;
                if (head == null) {
                    head = new ListNode(h);
                    pre = head;
                } else {
                    pre.next = new ListNode(h);
                    pre = pre.next;
                }

                h1 = h1 != null ? h1.next : null;
                h2 = h2 != null ? h2.next : null;
            }

            return head;
        }
    }
}
