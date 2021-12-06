package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/1 5:19 下午
 */
public class CountDigitOneTest {

    @Test
    public void countDigitOne() {
        CountDigitOne c = new CountDigitOne();
        int n1 = c.countDigitOne(100000);
        int n2 = 0;
        for (int i = 0; i <= 100000; i++) {
            char[] cc = (i + "").toCharArray();
            for (int k = 0; k < cc.length; k++) {
                if (cc[k] - 48 == 1) {
                    n2 ++;
                }
            }
        }

        Assert.assertEquals(n2, n1);
        System.out.println(n1 + " " + n2);
    }

    @Test
    public void countDigitOneHelper() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}