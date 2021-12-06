import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 4:46 下午
 */
public class GenerateParenthesisTest {

    @Test
    public void generateParenthesis() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> ans = gp.generateParenthesis(3);
        System.out.println(JSONObject.toJSONString(ans));
    }
}