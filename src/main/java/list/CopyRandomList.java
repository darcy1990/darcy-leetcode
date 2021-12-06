package list;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/21 5:25 下午
 */
public class CopyRandomList {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node k = head;
        Map<Node, Node> random = new HashMap<>();
        Map<Node, Node> pairs = new HashMap<>();
        Map<Node, Node> cPairs = new HashMap<>();

        Node dum = new Node(0);
        Node l = dum;
        while (k != null) {
            Node n = new Node(k.val);
            l.next = n;
            Node c1 = k;
            Node c2 = n;
            random.put(c1, c1.random);
            pairs.put(c2, c1);
            cPairs.put(c1, c2);
            k = k.next;
            l = l.next;
        }

        Node j = dum.next;
        while (j != null) {
            Node f = pairs.get(j);
            Node r = random.get(f);
            Node s = cPairs.get(r);
            j.random = s;
            j = j.next;
        }

        return dum.next;
    }

    public static class Node {
        int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
