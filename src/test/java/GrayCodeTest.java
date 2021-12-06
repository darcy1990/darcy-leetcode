import backtrack.GrayCode;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/25 5:44 下午
 */
public class GrayCodeTest {

    @Test
    public void grayCode() {
        GrayCode g = new GrayCode();
        List<Integer> ans = g.grayCode(5);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(Integer.toBinaryString(ans.get(i)));
        }
        System.out.println(JSONObject.toJSONString(ans));
    }
}