import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/9 5:37 下午
 */
public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {1, 2, 3, 4};
        int c = rd.removeDuplicates(nums);
        System.out.println(JSONObject.toJSONString(nums));
    }
}