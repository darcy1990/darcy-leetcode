import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/14 6:08 下午
 */
public class WordBreakTest {

    @Test
    public void wordBreak() {
        WordBreak wb = new WordBreak();
        boolean ans = wb.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Lists.newArrayList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        System.out.println(ans);
    }
}