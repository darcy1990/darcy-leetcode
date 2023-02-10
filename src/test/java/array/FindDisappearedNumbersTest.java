package array;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class FindDisappearedNumbersTest {

    @Test
    public void findDisappearedNumbers() {
        FindDisappearedNumbers f = new FindDisappearedNumbers();
        System.out.println(JSONObject.toJSONString(f.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})));
    }
}