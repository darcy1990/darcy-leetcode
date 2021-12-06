import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 6:12 下午
 */
public class FindRepeatNumberTest {

    @Test
    public void findRepeatNumber() {
        FindRepeatNumber frn = new FindRepeatNumber();
        int r = frn.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(r);
    }
}