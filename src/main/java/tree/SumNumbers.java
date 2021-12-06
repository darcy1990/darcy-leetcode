package tree;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/17 2:59 下午
 */
public class SumNumbers {

    private int sum;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sumNumbers(root, 0);
        return sum;
    }

    public void sumNumbers(TreeNode root, int pre) {
        int np = pre * 10 + root.val;
        if (root.left == null && root.right == null) {
            this.sum += np;
            return;
        }

        if (root.left != null) {
            sumNumbers(root.left, np);
        }

        if (root.right != null) {
            sumNumbers(root.right, np);
        }
    }
}
