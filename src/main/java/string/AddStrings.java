package string;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/30 11:29 上午
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int p1 = c1.length - 1;
        int p2 = c2.length - 1;
        char[] c = new char[Math.max(c1.length, c2.length)];
        int p = c.length - 1;

        int carry = 0;
        while (p1 >= 0 || p2 >= 0) {
            int s = (p1 >= 0 ? c1[p1] - '0' : 0) + (p2 >= 0 ? c2[p2] - '0' : 0) + carry;
            c[p] = (char) (s % 10 + '0');
            carry = s >= 10 ? 1 : 0;

            p1--;
            p2--;
            p--;
        }

        return carry == 0 ? new String(c) : ("1" + new String(c));
    }
}
