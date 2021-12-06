import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/28 4:33 下午
 */
public class IsUniqueTest {

    @Test
    public void isUnique() {
        IsUnique iu = new IsUnique();
        boolean ans = iu.isUnique("abc");
        System.out.println(ans);
    }
}