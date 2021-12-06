import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 5:49 下午
 */
public class DailyTemperaturesTest {

    @Test
    public void dailyTemperatures() {
        DailyTemperatures dt = new DailyTemperatures();
        int[] r = dt.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(JSONObject.toJSONString(r));
    }
}