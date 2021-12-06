import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/20 4:41 下午
 */
public class CombinationSumTest {

    @Test
    public void combinationSum() {
        CombinationSum s = new CombinationSum();
        List<List<Integer>> ret = s.combinationSum(new int[]{2,3,5}, 8);
        System.out.println(JSONObject.toJSONString(ret));
    }
}