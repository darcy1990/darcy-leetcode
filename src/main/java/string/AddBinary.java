package string;

import org.junit.Test;

public class AddBinary {

    @Test
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int len = Math.max(lenA, lenB);
        boolean overflow = false;
        for (int i = 0; i < len; i++) {
            int c = 0;
            if (a.length() > i) {
                c += a.charAt(a.length() - 1 - i) - '0';
            }
            if (b.length() > i) {
                c += b.charAt(b.length() - 1 - i) - '0';
            }

            if (overflow) {
                c += 1;
            }

            if (c > 1) {
                sb.append(c - 2);
                overflow = true;
            } else {
                sb.append(c);
                overflow = false;
            }
        }

        if (overflow) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}
