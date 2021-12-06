import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/3/30 2:29 下午
 */
public class WordDictionaryTest {

    @Test
    public void addWord() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("at");
        wordDictionary.addWord("and");
        wordDictionary.addWord("an");
        wordDictionary.addWord("add");
        wordDictionary.search("a");
        wordDictionary.search(".at"); // return False
        wordDictionary.addWord("bat"); // return True
        wordDictionary.search(".at"); // return True
        wordDictionary.search("an."); // return True
        wordDictionary.search("a.d."); // return True
        wordDictionary.search("b."); // return True
        wordDictionary.search("a.d"); // return True
        wordDictionary.search("."); // return True
    }
}