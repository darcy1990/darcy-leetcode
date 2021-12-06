import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/1 3:54 下午
 */
public class LongestCommonSubsequence {

    private Set<Character> ne = new HashSet<>();

    public int longestCommonSubsequence(String text1, String text2) {
        int p1 = 0;
        while (p1 < text1.length()) {
            char c1 = text1.charAt(p1);
            if (ne.contains(c1)) {
                return longestCommonSubsequence(text1.substring(p1 + 1), text2);
            }
            int i = text2.indexOf(c1);
            if (i < 0) {
                ne.add(c1);
                return longestCommonSubsequence(text1.substring(p1 + 1), text2);
            } else {
                int c = 0;
                while (p1 < text1.length() && i < text2.length()) {
                    if (text1.charAt(p1) == text2.charAt(i)) {
                        p1++;
                        i++;
                        c++;
                    } else {
                        break;
                    }
                }
                int l1 = longestCommonSubsequence(text1.substring(p1), text2);
                int l2 = longestCommonSubsequence(text1.substring(p1), text2.substring(i)) + c;
                return Math.max(l1, l2);
            }
        }

        return 0;
    }
}
