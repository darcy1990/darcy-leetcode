import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 4:24 下午
 */
public class GenerateParenthesis {

    private int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        return generateParenthesis(0, 0, "");
    }

    private List<String> generateParenthesis(int i, int j, String c) {
        List<String> ans = new ArrayList<>();
        if (i < n || j < n) {
            if (i == n) {
                for (int k = 0; k < n - j; k++) {
                    c += ")";
                }
                ans.add(c);
                return ans;
            }
            if (i < n) {
                ans.addAll(generateParenthesis(i + 1, j, c + "("));
            }

            if (j < n && i >= (j + 1)) {
                ans.addAll(generateParenthesis(i, j + 1, c + ")"));
            }
        } else {
            ans.add(c);
        }

        return ans;
    }
}
