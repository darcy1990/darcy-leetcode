package string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/12/4 5:19 下午
 */
public class MinWindowTest {

    @Test
    public void minWindow() {
        MinWindow mw = new MinWindow();
        Assert.assertEquals("a", mw.minWindow("a", "a"));
        Assert.assertEquals("", mw.minWindow("a", "aa"));
        Assert.assertEquals("BANC", mw.minWindow("ADOBECODEBANC", "ABC"));
        Assert.assertEquals("ADOBEC", mw.minWindow("ADOBECODEBAN", "ABC"));
        Assert.assertEquals("CBA", mw.minWindow("ADOBECODEBANCBA", "ABC"));
        Assert.assertEquals("CBA", mw.minWindow("ADOBEABCEBANCBA", "ABC"));
    }
}