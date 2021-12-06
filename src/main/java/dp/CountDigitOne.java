package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/31 5:34 下午
 */
public class CountDigitOne {

    private int[] num = new int[15];

    private int[][] dp = new int[15][15];

    public int countDigitOne(int n) {
        // 思路和 AtMostNGivenDigitSet 一样，轮询不同位数，然后对固定位数从高位到低位轮询。
        char[] chars = (n + "").toCharArray();
        int pos = chars.length;

        for (int i = 0; i < pos; i++) {
            num[i] = chars[pos - i - 1] - 48;
        }

        for (int p = 0; p < 15; p++) {
            for (int q = 0; q < 15; q++) {
                dp[p][q] = -1;
            }
        }
        int k = getDp(pos, 0, 1);

        return k;
    }

    private int getDp(int pos, int sum, int lim) {
        if (pos == -1) {
            return sum;
        }
        if (lim == 0 && dp[pos][sum] != -1)
            return dp[pos][sum];
        int up = lim > 0 ? num[pos] : 9; // 当前要枚举到的上界
        int ans = 0;
        for (int i = 0; i <= up; i++) { // 枚举当前位所有可能数字
            ans += getDp(pos - 1, sum + ((i == 1) ? 1 : 0), (lim > 0 && i == up) ? 1 : 0); // 本位被限制且选顶到上界的数字,下一位才被限制
        }

        if (lim == 0) {
            dp[pos][sum] = ans;
        }

        return ans;
    }

}
