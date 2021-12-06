import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/27 4:28 下午
 */
public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord l = new LengthOfLastWord();
        int ans = l.lengthOfLastWord("luffy is still joyboy");
        System.out.println(ans);
    }
}