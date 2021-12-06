import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/1 5:04 下午
 */
public class LongestCommonSubsequenceTest {

    @Test
    public void test() {
        LongestCommonSubsequence2 lcss = new LongestCommonSubsequence2();
        int l = lcss.longestCommonSubsequence("ylqpejqbalahwr", "yrkzavgdmdgtqpg");
        System.out.println(l);
    }

}