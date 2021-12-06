import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/10 5:12 下午
 */
public class FindSubstringTest {

    @Test
    public void findSubstring() {
        FindSubstring fs = new FindSubstring();
        List<Integer> ans = fs.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"});
        System.out.println(JSONObject.toJSONString(ans));
    }
}