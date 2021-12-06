package list;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/10 11:07 上午
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        // pointers
        ListNode[] heads = new ListNode[lists.length];
        for (int i = 0; i < heads.length; i++) {
            heads[i] = lists[i];
        }

        ListNode pre = new ListNode();
        ListNode n = pre;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        while (true) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < heads.length; i++) {
                if (heads[i] != null) {
                    max = Math.max(max, heads[i].val);
                }
            }

            for (int i = 0; i < heads.length; i++) {
                ListNode p = heads[i];
                while (p != null && p.val <= max) {
                    queue.add(p);
                    p = p.next;
                    heads[i] = p;
                }
            }

            if (queue.isEmpty()) {
                break;
            }

            while (!queue.isEmpty()) {
                ListNode min = queue.poll();
                min.next = null;
                n.next = min;
                n = n.next;
            }
        }

        return pre.next;
    }
}
