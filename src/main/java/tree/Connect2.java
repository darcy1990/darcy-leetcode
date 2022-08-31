package tree;

public class Connect2 {

    public Node connect(Node root) {
        mid(root);
        return root;
    }

    private void mid(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null) {
            return;
        }

        connect(root.left, root.right);
        mid(root.left);
        mid(root.right);
    }

    private void connect(Node left, Node right) {
        while (left != null && right != null) {
            left.next = right;
            left = left.right != null ? left.right : left.left;
            right = right.left != null ? right.left : right.right;
        }
    }

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
