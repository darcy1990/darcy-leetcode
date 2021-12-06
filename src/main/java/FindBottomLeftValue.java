import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/23 4:45 下午
 */
public class FindBottomLeftValue {

    private Stack<TreeNode> s = new Stack<>();

    private int h;

    public int findBottomLeftValue(TreeNode root) {
        h = h(root);
        TreeNode t = dfs(root);
        return t.val;
    }

    private TreeNode dfs(TreeNode node) {
        if (node == null) {
            return null;
        }

        s.add(node);
        if (s.size() == h) {
            return node;
        }
        TreeNode l = dfs(node.left);
        if (l != null) {
            return l;
        }
        TreeNode r = dfs(node.right);
        if (r != null) {
            return r;
        }
        s.pop();
        return null;
    }

    private int h(TreeNode n) {
        if (n == null) {
            return 0;
        }
        return Math.max(h(n.left), h(n.right)) + 1;
    }
}
