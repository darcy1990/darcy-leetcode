import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/11 5:55 下午
 */
public class SubsetsTest {

    @Test
    public void subsets() {
        Subsets s = new Subsets();
        List<List<Integer>> ret = s.subsetsWithDup(new int[]{0});
        System.out.println(JSONObject.toJSONString(ret));
    }
}