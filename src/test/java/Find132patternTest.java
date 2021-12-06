import array.Find132pattern;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/23 4:39 下午
 */
public class Find132patternTest {

    @Test
    public void find132pattern() throws IOException {
        Find132pattern f = new Find132pattern();
        String line = FileUtils.readFileToString(new File("/Users/yuanzhongming/IdeaProjects/algorithm/src/test/java/data.txt"), "UTF-8");
        String[] arr = line.split(",");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        f.find132pattern(a);
    }
}