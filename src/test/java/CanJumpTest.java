import dp.CanJump;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/3/26 11:03 上午
 */
public class CanJumpTest extends TestCase {

    @Test
    public void testCanJump() {
        CanJump t = new CanJump();
        System.out.println(t.canJump(new int[]{2,3,1,1,4}));
    }
}