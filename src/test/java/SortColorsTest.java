import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/27 11:32 上午
 */
public class SortColorsTest {

    @Test
    public void sortColors() {
        SortColors sc = new SortColors();
        int[] nums = {2,0,2,1,1,0,1,2,1,1,1,2,2,0,0,1,0};
        sc.sortColors(nums);
        System.out.println(JSONObject.toJSONString(nums));
    }
}