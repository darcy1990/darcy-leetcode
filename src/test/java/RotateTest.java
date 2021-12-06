import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/1 6:19 下午
 */
public class RotateTest {

    @Test
    public void rotate() {
        Rotate r = new Rotate();
        r.rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }
}