import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 3:32 下午
 */
public class MaxEnvelopesTest {

    @Test
    public void maxEnvelopes() {
        MaxEnvelopes me = new MaxEnvelopes();
        int ans = me.maxEnvelopes(new int[][]{{1,1},{1,2},{2,3}});
        System.out.println(ans);
    }
}