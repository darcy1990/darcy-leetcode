import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/15 5:55 下午
 */
public class MaxSlidingWindowTest {

    @Test
    public void maxSlidingWindow() throws IOException {
        MaxSlidingWindow m = new MaxSlidingWindow();
        String s = FileUtils.readFileToString(new File("/Users/yuanzhongming/Desktop/data.txt"), "utf-8");
        String[] ss = s.split(",");
        int[] arr = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            arr[i] = Integer.parseInt(ss[i]);
        }
        int[] ans = m.maxSlidingWindow(arr, 45);

        MaxSlidingWindow2 m2 = new MaxSlidingWindow2();
        int[] ans2 = m2.maxSlidingWindow(arr, 45);
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != ans2[i]) {
                System.out.println(i + " " + ans[i] + " " + ans2[i]);
            }
        }

        System.out.println(ans.length);
        System.out.println(ans2.length);
    }

    @Test
    public void maxSlidingWindow2() throws IOException {
        MaxSlidingWindow2 m = new MaxSlidingWindow2();
        String s = FileUtils.readFileToString(new File("/Users/yuanzhongming/Desktop/data.txt"), "utf-8");
        String[] ss = s.split(",");
        int[] arr = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            arr[i] = Integer.parseInt(ss[i]);
        }
        int[] ans = m.maxSlidingWindow(arr, 45);
        System.out.println(JSONObject.toJSONString(ans));
    }
}