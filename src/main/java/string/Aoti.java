package string;

public class Aoti {

    public static void main(String[] args) {
        Aoti a = new Aoti();
        System.out.println(a.myAtoi(" "));
    }

    public int myAtoi(String s) {
        if (s == null) {
            return 0;
        }

        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        String m = s;
        boolean p = true;

        char c = s.charAt(0);
        if (c == '+') {
            p = true;
            m = s.substring(1);
        } else if (c == '-') {
            p = false;
            m = s.substring(1);
        }

        int sum = 0;
        for (char mc : m.toCharArray()) {
            if (mc < '0' || mc > '9') {
                break;
            }
            int v = mc - 48;

            if (p && (sum > 214748364 || (sum == 214748364 && v > 7))) {
                return 2147483647;
            }

            if (!p && (sum > 214748364 || (sum == 214748364 && v > 8))) {
                return -2147483648;
            }
            sum = sum * 10 + v;
        }

        return p ? sum : 0 - sum;
    }
}
