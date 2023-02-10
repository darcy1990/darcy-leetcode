package array;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class SortArrayTest {

    @Test
    public void sortArray() {
        SortArray sa = new SortArray();
        System.out.println(JSONObject.toJSONString(sa.sortArray(new int[]{5, 1, 1, 2, 0, 0})));
    }
}