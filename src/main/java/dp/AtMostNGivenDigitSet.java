package dp;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/31 4:27 下午
 */
public class AtMostNGivenDigitSet {

    public int atMostNGivenDigitSet(String[] digits, int n) {
        if (digits.length == 0) {
            return 0;
        }
        char[] chars = (n + "").toCharArray();
        int len = chars.length;
        int[] d = new int[len];
        for (int i = 0; i < len; i++) {
            d[i] = chars[len - i - 1] - 48;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            set.add(Integer.parseInt(digits[i]));
        }

        int s = 0;
        for (int i = 0; i < len; i++) {
            int[][] dp = new int[i + 1][2];
            for (int p = 0; p < i + 1; p++) {
                for (int q = 0; q < 2; q++) {
                    dp[p][q] = -1;
                }
            }
            s += getDp(i, i < len - 1 ? 0 : 1, d, set, dp);
        }
        return s;
    }

    private int getDp(int pos, int lim, int[] digits, Set<Integer> set, int[][] dp) {
        if (pos == -1) return 1;
        if (dp[pos][lim] != -1)
            return dp[pos][lim];
        dp[pos][lim] = 0;
        int up = lim == 1 ? digits[pos] : 9; // 当前要枚举到的上界
        for (int i : set) // 枚举当前位所有可能数字
        {
            if (i > up)
                break;
            dp[pos][lim] += getDp(pos - 1, (lim > 0 && i == up) ? 1 : 0, digits, set, dp); // 本位被限制且选顶到上界的数字,下一位才被限制
        }
        return dp[pos][lim];
    }
}
