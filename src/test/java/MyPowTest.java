import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/2 6:00 下午
 */
public class MyPowTest {

    @Test
    public void myPow() {
        MyPow mp = new MyPow();
        double a = mp.myPow(0.00001,2147483647);
        System.out.print(a);
    }
}