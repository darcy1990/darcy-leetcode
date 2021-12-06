import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/17 2:08 下午
 */
public class MinimumTotalTest {

    @Test
    public void minimumTotal() {
        MinimumTotal m = new MinimumTotal();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Lists.newArrayList(2));
        triangle.add(Lists.newArrayList(3, 4));
        triangle.add(Lists.newArrayList(6, 5, 7));
        triangle.add(Lists.newArrayList(4, 1, 8, 3));
        m.minimumTotal(triangle);
    }
}