package dp.prefix;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/1 4:10 下午
 */
public class XorQueriesTest {

    @Test
    public void xorQueries() {
        XorQueries x = new XorQueries();
        int[] ans = x.xorQueries(new int[]{4, 8, 2, 10}, new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}});
        System.out.println(JSONObject.toJSONString(ans));
    }
}