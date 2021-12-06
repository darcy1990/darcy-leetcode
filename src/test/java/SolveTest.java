import junit.framework.TestCase;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/3/26 2:36 下午
 */
public class SolveTest extends TestCase {

    @Test
    public void testSolve() {
        Solve s = new Solve();
        s.solve(new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}});
    }
}