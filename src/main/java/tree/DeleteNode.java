package tree;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/23 1:39 下午
 */
public class DeleteNode {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            if (root.right == null) {
                return root.left;
            }

            // find max left
            TreeNode ml = root.right;
            TreeNode mp = null;
            while (ml != null && ml.left != null) {
                mp = ml;
                ml = ml.left;
            }

            if (mp != null) {
                ml.left = root.left;
                ml.right = root.right;
                mp.left = null;
            } else {
                ml.left = root.left;
            }

            root = null;
            return ml;
        }

        deleteNode(root.left, 0, key, root);
        deleteNode(root.right, 1, key, root);

        return root;
    }

    public void deleteNode(TreeNode n, int lr, int key, TreeNode p) {
        if (n == null) {
            return;
        }
        if (n.val == key) {
            // find max left
            TreeNode ml = n.right;
            TreeNode mp = null;
            while (ml != null && ml.left != null) {
                mp = ml;
                ml = ml.left;
            }

            if (ml != null) {
                if (lr > 0) {
                    p.right = ml;
                } else {
                    p.left = ml;
                }

                if (mp != null) {
                    ml.left = n.left;
                    ml.right = n.right;
                    mp.left = null;
                } else {
                    ml.left = n.left;
                }
            } else {
                if (lr > 0) {
                    p.right = n.left;
                } else {
                    p.left = n.left;
                }
            }
            n = null;
            return;
        }

        deleteNode(n.left, 0, key, n);
        deleteNode(n.right, 1, key, n);
    }
}
