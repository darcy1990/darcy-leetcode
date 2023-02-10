package dp;

import tree.TreeNode;

public class Rob3 {

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.val < 0) {
            return -root.val;
        }
        int robRoot = root.val
                + (root.left != null ? (rob(root.left.left) + rob(root.left.right)) : 0)
                + (root.right != null ? rob(root.right.left) + rob(root.right.right) : 0);
        int notRobRoot = rob(root.left) + rob(root.right);
        int max = Math.max(robRoot, notRobRoot);

        root.val = -max;
        return max;
    }
}
