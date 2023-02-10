package number;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class CountBitsTest {

    @Test
    public void countBits() {
        CountBits cb = new CountBits();
        System.out.println(JSONObject.toJSONString(cb.countBits(1)));
    }
}