import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/25 6:32 下午
 */
public class ReverseWordsTest {

    @Test
    public void reverseWords() {
        ReverseWords rw = new ReverseWords();
        String s = rw.reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }
}