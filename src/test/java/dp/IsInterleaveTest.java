package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/27 2:13 下午
 */
public class IsInterleaveTest {

    @Test
    public void isInterleave() {
        IsInterleave l = new IsInterleave();
        Assert.assertEquals(true, l.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        Assert.assertEquals(false, l.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        Assert.assertEquals(true, l.isInterleave("", "", ""));
        Assert.assertEquals(false, l.isInterleave("", "abc", "ab"));
        Assert.assertEquals(true, l.isInterleave("abc", "bca", "abbcca"));

    }
}