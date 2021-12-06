/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/15 6:08 下午
 */
public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right)
                && Math.abs(h(root.left) - h(root.right)) <= 1;
    }

    private int h(TreeNode n) {
        if (n == null) {
            return 0;
        }
        if (n.left == null && n.right == null) {
            return 1;
        }

        return Math.max(h(n.left), h(n.right)) + 1;
    }
}
