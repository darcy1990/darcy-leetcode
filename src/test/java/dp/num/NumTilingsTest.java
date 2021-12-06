package dp.num;

import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/30 3:31 下午
 */
public class NumTilingsTest {

    @Test
    public void numTilings() {
        NumTilings n = new NumTilings();
        for (int i = 1; i <= 40; i++) {
            System.out.println(n.numTilings(i));
        }
//        Assert.assertEquals(1, n.numTilings(1));
//        Assert.assertEquals(2, n.numTilings(2));
//        Assert.assertEquals(5, n.numTilings(3));
//        Assert.assertEquals(11, n.numTilings(4));
    }
}