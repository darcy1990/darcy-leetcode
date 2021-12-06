import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/5 6:40 下午
 */
public class IsSubStructureTest {

    @Test
    public void isSubStructure() {
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(4);
        t.left.left = new TreeNode(1);
        t.left.right = new TreeNode(2);
        t.right = new TreeNode(5);

        TreeNode t1 = new TreeNode(4);
        t1.left = new TreeNode(1);

        IsSubStructure is = new IsSubStructure();
        boolean ans = is.isSubStructure(t, t1);
        System.out.println(ans);
    }
}