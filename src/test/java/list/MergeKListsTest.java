package list;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/10 11:51 上午
 */
public class MergeKListsTest {

    @Test
    public void mergeKLists() {
        ListNode l1 = buildListNode(new int[]{-2,-1,-1,-1});
        ListNode l2 = buildListNode(new int[]{});
        ListNode l3 = buildListNode(new int[]{});
        ListNode[] ll = new ListNode[]{l1, l2, l3};
        MergeKLists mk = new MergeKLists();
        mk.mergeKLists(ll);
    }

    private ListNode buildListNode(int[] arr) {
        ListNode pre = new ListNode();
        ListNode p = pre;
        for (int i = 0; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }

        return pre.next;
    }
}