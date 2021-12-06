package dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/27 4:27 下午
 */
public class IsScrambleTest {

    @Test
    public void isScramble() {
        IsScramble s = new IsScramble();
        Assert.assertEquals(true, s.isScramble("great", "rgeat"));
        Assert.assertEquals(false, s.isScramble("abcde", "caebd"));
        Assert.assertEquals(true, s.isScramble("a", "a"));
        Assert.assertEquals(true, s.isScramble("abca", "caba"));
        Assert.assertEquals(true, s.isScramble("abb", "bba"));
    }
}