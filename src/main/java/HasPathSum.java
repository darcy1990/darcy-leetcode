/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/15 6:22 下午
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }


        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) {
                return true;
            } else {
                return false;
            }
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
