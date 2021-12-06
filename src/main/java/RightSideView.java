import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/12 6:07 下午
 */
public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> r = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();
            for(int i = nodes.size() - 1; i >= 0; i--) {
                TreeNode n = nodes.get(i);
                if (i == nodes.size() - 1) {
                    r.add(n.val);
                }
                if (n.right != null) {
                    next.add(n.right);
                }
                if (n.left != null) {
                    next.add(n.left);
                }
            }
            Collections.reverse(next);
            nodes = next;
        }

        return r;
    }
}
