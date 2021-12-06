package dp;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 5:51 下午
 */
public class LenLongestFibSubseqTest {

    @Test
    public void lenLongestFibSubseq() {
        LenLongestFibSubseq fs = new LenLongestFibSubseq();
        int ans = fs.lenLongestFibSubseq(new int[]{2,4,5,6,7,8,11,13,14,15,21,22,34});
        System.out.println(ans);
    }
}