import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/12 6:36 下午
 */
public class RightSideViewTest {

    @Test
    public void rightSideView() {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.left.right = new TreeNode(4);
        n.right.right = new TreeNode(5);
        RightSideView rsv = new RightSideView();
        rsv.rightSideView(n);
    }
}