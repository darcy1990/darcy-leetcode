import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 11:42 上午
 */
public class PartitionTest {

    @Test
    public void partition() {
        Partition p = new Partition();
        List<List<String>> pp = p.partition("efe");
        System.out.println(JSONObject.toJSONString(pp));
    }
}