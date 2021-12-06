import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/17 6:06 下午
 */
public class SolveNQueensTest {

    @Test
    public void solveNQueens() {
        SolveNQueens sq = new SolveNQueens();
        List<List<String>> ans = sq.solveNQueens(4);
        System.out.println(JSONObject.toJSONString(ans));
    }
}