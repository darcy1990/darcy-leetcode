package array;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12, 0, 5, 7, 0, 0, 5, 8, 9, 2};
        mz.moveZeroes(nums);
        System.out.println(JSONObject.toJSONString(nums));
    }
}