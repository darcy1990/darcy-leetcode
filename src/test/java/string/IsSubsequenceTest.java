package string;

import org.junit.Test;

public class IsSubsequenceTest {

    @Test
    public void isSubsequence() {
        IsSubsequence is = new IsSubsequence();
        System.out.println(is.isSubsequence("ba", "b"));
        System.out.println(is.isSubsequence("axc", "ahbgdc"));
    }
}