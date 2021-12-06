import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/3 3:11 下午
 */
public class Count {

    public static void main(String[] args) throws IOException {
        List<String> lines = FileUtils.readLines(new File("/Users/yuanzhongming/Desktop/count3.txt"), "utf-8");
        int pre = 0;
        for (int i = 0; i < lines.size(); i++) {
            String l = lines.get(i);
            if (l.contains("60877770")) {
                int c = i - pre;
                System.out.println(c);
                if (c < 674) {
                    System.out.println(l);
                    System.out.println(c);
                    break;
                }
                pre = i;
            }
        }
    }
}
