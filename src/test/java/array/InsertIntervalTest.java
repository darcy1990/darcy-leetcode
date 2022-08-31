package array;

import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;
import org.junit.Test;

public class InsertIntervalTest extends TestCase {

    @Test
    public void testInsert() {
        InsertInterval ii = new InsertInterval();
        int[][] intervals = new int[][]{{5, 8}};
        System.out.println(JSONObject.toJSONString(ii.insert(intervals, new int[]{6, 7})));
    }
}