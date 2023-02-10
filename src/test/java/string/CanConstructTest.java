package string;

import org.junit.Test;

public class CanConstructTest {

    @Test
    public void canConstruct() {
        CanConstruct cc = new CanConstruct();
        System.out.println(cc.canConstruct("a", "b"));
        System.out.println(cc.canConstruct("aa", "ab"));
        System.out.println(cc.canConstruct("aa", "aab"));
    }
}