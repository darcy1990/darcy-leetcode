import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/15 5:53 下午
 */
public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            List<TreeNode> ln = new ArrayList<>();
            for (TreeNode node : nodes) {
                l.add(node.val);

                if (node.left != null) {
                    ln.add(node.left);
                }

                if (node.right != null) {
                    ln.add(node.right);
                }
            }
            ret.add(l);

            nodes = ln;
        }

        return ret;
    }
}
