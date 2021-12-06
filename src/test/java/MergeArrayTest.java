import array.MergeArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/9 6:22 下午
 */
public class MergeArrayTest {

    @Test
    public void merge() {
        MergeArray ma = new MergeArray();
        int[] arr = {1, 2, 3, 0, 0, 0};
        ma.merge(arr, 3, new int[]{2,5,6}, 3);
        System.out.print(JSONObject.toJSONString(arr));
    }
}