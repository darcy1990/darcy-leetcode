import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/21 10:08 上午
 */
public class CombinationSum2Test {

    @Test
    public void combinationSum2() {
        CombinationSum2 c = new CombinationSum2();
        List<List<Integer>> r = c.combinationSum2(new int[]{4,4,2,1,4,2,2,1,3}, 6);
        System.out.println(JSONObject.toJSONString(r));
    }
}