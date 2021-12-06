import org.junit.Test;
import string.AddStrings;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/30 11:36 上午
 */
public class AddStringsTest {

    @Test
    public void addStrings() {
        AddStrings as = new AddStrings();
        String r = as.addStrings("12", "199");
        System.out.println(r);
    }
}