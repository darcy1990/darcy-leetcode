import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/4 5:58 下午
 */
public class LetterCombinationsTest {

    @Test
    public void letterCombinations() {
        LetterCombinations lc = new LetterCombinations();
        List<String> ans = lc.letterCombinations("2222");
        System.out.println(JSONObject.toJSONString(ans));
    }
}