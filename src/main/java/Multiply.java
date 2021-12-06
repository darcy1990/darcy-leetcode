import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/13 4:03 下午
 */
public class Multiply {

    private Map<String, String> cache = new HashMap<>();

    public String multiply(String num1, String num2) {
        String key = num1 + "-" + num2;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        if (num1.endsWith("0")) {
            return multiply(num1.substring(0, num1.length() - 1), num2) + "0";
        }

        if (num2.endsWith("0")) {
            return multiply(num1, num2.substring(0, num2.length() - 1)) + "0";
        }

        if (num1.length() == 1 && num2.length() == 1) {
            return (Integer.parseInt(num1) * Integer.parseInt(num2)) + "";
        }
        String a1 = num1.substring(num1.length() - 1);
        String a2 = num1.length() > 1 ? num1.substring(0, num1.length() - 1) + "0" : "0";
        String b1 = num2.substring(num2.length() - 1);
        String b2 = num2.length() > 1 ? num2.substring(0, num2.length() - 1) + "0" : "0";
        String ans = add(multiply(a2, b2), multiply(a1, b2), multiply(a2, b1), multiply(a1, b1));
        cache.put(key, ans);

        return ans;
    }

    private String add(String a, String b, String c, String d) {
        return addStrings(a, addStrings(b, addStrings(c, d)));
    }

    public String addStrings(String num1, String num2) {
        if (num1.equals("0")) {
            return num2;
        }
        if (num2.equals("0")) {
            return num1;
        }

        if (num1.length() < 8 && num2.length() < 8) {
            return (Integer.parseInt(num1) + Integer.parseInt(num2)) + "";
        }
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
