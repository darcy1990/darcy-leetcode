import java.util.Arrays;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/21 5:46 下午
 */
public class CanWin {

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= maxChoosableInteger) {
            return true;
        }
        int k = pow(maxChoosableInteger);
        boolean[] dp = new boolean[k];

        Arrays.fill(dp, true);

        int[] v = new int[k];
        for (int i = 0; i < maxChoosableInteger; i++) {
            v[1 << i] = i + 1;
        }

        for (int i = (1 << (maxChoosableInteger - 1)) + 1; i < k; i++) { // ?
            for (int j = 0; j < maxChoosableInteger; j++) {
                if ((i & pow(j)) == pow(j)) {
                    if (v[i] == 0 && v[i ^ pow(j)] > 0) {
                        v[i] = v[i - pow(j)] + j + 1;
                    }
                    if (dp[i - pow(j)]) {
                        dp[i] = false;
                        break;
                    }
                }
            }

            System.out.println(i + " " + dp[i] + " " + v[i]);

            if (dp[i] && v[i] >= desiredTotal) {
                return true;
            }

            if (v[i] > desiredTotal + maxChoosableInteger) {
                return false;
            }
        }

        return false;
    }

    private int pow(int c) {
        return 1 << c;
    }
}
