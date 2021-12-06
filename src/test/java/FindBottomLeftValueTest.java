import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/24 11:38 上午
 */
public class FindBottomLeftValueTest {

    @Test
    public void test() {
        FindBottomLeftValue fbl = new FindBottomLeftValue();
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.left.left = new TreeNode(4);
        n.right.left = new TreeNode(5);
        n.right.right = new TreeNode(6);
        n.right.left.left = new TreeNode(7);
        fbl.findBottomLeftValue(n);
    }

}