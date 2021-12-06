import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/3 5:47 下午
 */
public class SmallestKTest {

    @Test
    public void smallestK() {
        SmallestK sk = new SmallestK();
        int[] ans = sk.smallestK(new int[]{1,3,5,7,2,4,6,8}, 4);
        System.out.println(JSONObject.toJSONString(ans));
    }
}