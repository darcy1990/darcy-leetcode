package tree;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/23 3:07 下午
 */
public class DeleteNodeTest {

    @Test
    public void deleteNode() {
        DeleteNode dn = new DeleteNode();
        TreeNode n = new TreeNode(5);
        n.left = new TreeNode(3);
        n.right = new TreeNode(6);
        n.left.left = new TreeNode(2);
        n.left.right = new TreeNode(4);
        n.right.right = new TreeNode(7);
        dn.deleteNode(n, 3);
        System.out.println(n);
    }
}