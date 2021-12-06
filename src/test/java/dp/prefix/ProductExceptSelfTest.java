package dp.prefix;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/30 3:53 下午
 */
public class ProductExceptSelfTest {

    @Test
    public void productExceptSelf() {
        ProductExceptSelf p = new ProductExceptSelf();
        int[] ans = p.productExceptSelf(new int[]{1, 2, 3, 4, 5});
        System.out.println(JSONObject.toJSONString(ans));
    }
}