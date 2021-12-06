/**
 * @Author: Zhongming Yuan
 * @Date: 2021/12/1 5:38 下午
 */
public class MaxPathSum {

    private int m = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return m;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int max = root.val;
        max = Math.max(root.val + left, max);
        max = Math.max(root.val + right, max);
        max = Math.max(root.val + left + right, max);
        m = Math.max(m, max);
        return Math.max(Math.max(root.val + left, root.val + right), root.val);
    }
}
