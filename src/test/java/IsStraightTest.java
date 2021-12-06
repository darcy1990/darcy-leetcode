import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/21 4:58 下午
 */
public class IsStraightTest {

    @Test
    public void isStraight() {
        IsStraight is = new IsStraight();
        boolean ans = is.isStraight(new int[]{11,0,9,0,0});
        System.out.println(ans);
    }
}