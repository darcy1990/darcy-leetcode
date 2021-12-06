/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 2:36 下午
 */
public class KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        return find(root, k).val;
    }

    public TreeNode find(TreeNode node, int k) {
        int cl = count(node.left);
        if (cl > k) {
            return find(node.left, k);
        } else if (cl == k) {
            return rightest(node.left);
        } else if (cl == k - 1) {
            return node;
        } else if (cl < k) {
            return find(node.right, k - cl - 1);
        }

        return null;
    }

    public TreeNode rightest(TreeNode node) {
        TreeNode t = node;
        while (t.right != null) t = t.right;
        return t;
    }

    public int count(TreeNode n) {
        if (n == null) {
            return 0;
        }
        if (n.left == null && n.right == null) {
            return 1;
        }

        return 1 + count(n.left) + count(n.right);
    }
}
