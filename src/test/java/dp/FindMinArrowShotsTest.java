package dp;

import junit.framework.TestCase;
import org.junit.Test;

public class FindMinArrowShotsTest extends TestCase {

    @Test
    public void testFindMinArrowShots() {
        FindMinArrowShots f = new FindMinArrowShots();
        System.out.println(f.findMinArrowShots(new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}}));
    }
}