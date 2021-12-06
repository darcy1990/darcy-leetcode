import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/12/1 6:14 下午
 */
public class MaxPathSumTest {

    @Test
    public void maxPathSum() {
        TreeNode t = new TreeNode(-10);
        t.left = new TreeNode(9);
        t.left.left = new TreeNode(9);
        t.left.left.left = new TreeNode(1000);
        t.left.right = new TreeNode(200);
        t.left.right.left = new TreeNode(100);
        t.right = new TreeNode(20);
        t.right.left = new TreeNode(15);
        t.right.right = new TreeNode(7);
        MaxPathSum m = new MaxPathSum();
        System.out.println(m.maxPathSum(t));
    }
}