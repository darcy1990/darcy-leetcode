import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/21 6:03 下午
 */
public class PlusOneTest {

    @Test
    public void plusOne() {
        PlusOne p = new PlusOne();
        int[] ans = p.plusOne(new int[]{9, 9, 9});
        System.out.println(JSONObject.toJSONString(ans));
    }
}