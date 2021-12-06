package dp;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/24 4:51 下午
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < len; i++) {
            int p = prices[i];
            if (p > prices[i - 1]) {
                max = Math.max(p - min, max);
            } else {
                min = Math.min(p, min);
            }
        }

        return max;
    }
}
