/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/16 6:06 下午
 */
public class Flatten {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null) {
            flatten(root.right);
            return;
        }

        TreeNode r = root.right;

        flatten(root.left);

        TreeNode t = root.left;
        while (t.right != null) t = t.right;

        t.right = r;
        root.right = root.left;
        root.left = null;

        flatten(r);
    }
}
