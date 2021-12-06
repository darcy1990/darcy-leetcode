import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 4:42 下午
 */
public class IsPalindromeTest {

    @Test
    public void testIsPalindrome() {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        IsPalindrome ip = new IsPalindrome();
        ip.isPalindrome(l);
    }

}