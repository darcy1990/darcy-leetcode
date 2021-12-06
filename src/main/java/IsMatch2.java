import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/3 6:23 下午
 */
public class IsMatch2 {


    /**
     *       f(i, j)  =
     *                 p(j) = '*', f(i - k, j - 2)
     *                     p(j - 1) = . f(i, j - 2) || f(i - 1, j)
     *                     p(j - 1) != . s[i] = p[j - 1] ? f(i, j - 2) || f(i - 1, j) : f(i, j - 2)
     *                 p(j) = '.', f(i - 1, j - 1)
     *                 s(i) = p(j), f(i - 1, j - 1);
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {

        // split p
        List<String> l = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
                l.add(p.substring(i, i + 2));
                i++;
            } else {
                l.add(p.substring(i, i + 1));
            }
        }

        boolean[][] dp = new boolean[s.length() + 1][l.size() + 1];
        // init
        dp[0][0] = true;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).length() > 1) {
                dp[0][i + 1] = true;
            } else {
                break;
            }
        }
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 1; j < l.size() + 1; j++) {
                char mc = s.charAt(i - 1);
                char[] nc = l.get(j - 1).toCharArray();
                boolean b = false;
                if (nc.length > 1) {
                    char c1 = nc[0];
                    if (c1 == '.' || mc == c1) {
                        b = dp[i][j - 1] || dp[i - 1][j];
                    } else {
                        b = dp[i][j - 1];
                    }
                } else if (nc[0] == '.' || mc == nc[0]) {
                    b = dp[i - 1][j - 1];
                }

                dp[i][j] = b;
            }
        }

        return dp[s.length()][l.size()];
    }
}
