package string;

import org.junit.Test;

public class TranslateNumTest {

    @Test
    public void translateNum() {
        TranslateNum tn = new TranslateNum();
        System.out.println(tn.translateNum(Integer.MAX_VALUE - 2000));
    }
}