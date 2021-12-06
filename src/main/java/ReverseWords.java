/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/25 6:16 下午
 */
public class ReverseWords {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] chars = s.toCharArray();

        int m = 0;
        int i = 0;
        for (; i < chars.length; i++) {
            if (Character.isSpaceChar(chars[i])) {
                reverse(chars, m, i - 1);
                m = i + 1;
                continue;
            }
        }

        reverse(chars, m, chars.length - 1);

        return new String(chars);
    }

    private void reverse(char[] chars, int m, int n) {
        if (m >= n) {
            return;
        }
        int half = (n - m) / 2;
        for (int i = m; i <= m + half; i++) {
            char t = chars[i];
            chars[i] = chars[n - (i - m)];
            chars[n - (i - m)] = t;
        }
    }
}
