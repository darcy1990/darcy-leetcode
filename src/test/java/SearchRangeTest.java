import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/20 4:04 下午
 */
public class SearchRangeTest {

    @Test
    public void searchRange() {
        SearchRange sr = new SearchRange();
        int[] a = sr.searchRange(new int[]{5,7,7,8,8,10}, 6);
        System.out.println(JSONObject.toJSONString(a));
    }
}