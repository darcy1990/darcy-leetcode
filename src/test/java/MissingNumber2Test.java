import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/18 9:53 上午
 */
public class MissingNumber2Test {

    @Test
    public void missingNumber() {
        MissingNumber2 mn = new MissingNumber2();
        int ans = mn.missingNumber(new int[]{0,1});
        System.out.println(ans);
    }
}