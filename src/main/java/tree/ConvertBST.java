package tree;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/9 5:39 下午
 */
public class ConvertBST {

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    private void convert(TreeNode node) {
        if (node == null) {
            return;
        }
        convert(node.right);
        sum += node.val;
        node.val = sum;
        convert(node.left);
    }
}
