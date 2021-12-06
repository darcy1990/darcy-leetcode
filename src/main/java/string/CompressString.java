package string;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/11 5:58 下午
 */
public class CompressString {

    public String compressString(String S) {
        if (S.length() <= 2) {
            return S;
        }
        StringBuffer ans = new StringBuffer();
        char[] chars = S.toCharArray();
        char cur = chars[0];
        int c = 1;
        for (int i = 1; i < chars.length ; i++) {
            if (chars[i] == cur) {
                c++;
                continue;
            }

            ans.append(cur).append(c);
            if (ans.length() >= S.length()) {
                return S;
            }
            cur = chars[i];
            c = 1;
        }

        ans.append(cur).append(c);
        return ans.length() < S.length() ? ans.toString() : S;
    }
}
