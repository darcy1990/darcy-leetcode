/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/14 9:09 下午
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char c = chars[0];
        int cc = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != c) {
                sb.append(cc).append(c);
                c = chars[i];
                cc = 1;
            } else {
                cc++;
            }
        }

        sb.append(cc).append(c);

        return sb.toString();
    }
}
