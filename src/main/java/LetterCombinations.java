import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/4 5:40 下午
 */
public class LetterCombinations {

    private static String[][] arr = new String[][]{{}, {}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"},
            {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};

    public List<String> letterCombinations(String digits) {
        return new ArrayList<>(new HashSet<>(lc(digits)));
    }

    private List<String> lc(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        char k = digits.charAt(0);
        String[] a = arr[k - 48];
        for (int i = 0; i < a.length; i++) {
            if (digits.substring(1).length() == 0) {
                ans.add(a[i]);
                continue;
            }
            List<String> sub = lc(digits.substring(1));
            for (int j = 0; j < sub.size(); j++) {
                ans.add(a[i] + sub.get(j));
            }
        }

        return ans;
    }
}
