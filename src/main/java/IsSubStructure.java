/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/5 6:29 下午
 */
public class IsSubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) {
            return false;
        }
        return preOrder(A, B);
    }

    private boolean preOrder(TreeNode a, TreeNode b) {
        if (a == null) {
            return false;
        }

        return check(a, b) || preOrder(a.left, b) || preOrder(a.right, b);
    }

    private boolean check(TreeNode m, TreeNode n) {
        if (n == null) {
            return true;
        }

        if (m == null || m.val != n.val) {
            return false;
        }

        return check(m.left, n.left) && check(m.right, n.right);
    }
}
