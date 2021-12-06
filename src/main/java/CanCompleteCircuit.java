/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/6 5:42 下午
 */
public class CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] profit = new int[gas.length];
        for (int i = 0; i < gas.length; i++) {
            profit[i] = gas[i] - cost[i];
        }

        for (int i = 0; i < profit.length; i++) {
            if (profit[i] < 0) {
                continue;
            }

            int left = profit[i];
            boolean circle = true;
            for (int j = i + 1; ; j++) {
                if (j > profit.length - 1) {
                    j = j - profit.length;
                }

                if (j == i) {
                    break;
                }

                left += profit[j];
                if (left < 0) {
                    circle = false;
                    break;
                }
            }

            if (circle) {
                return i;
            }
        }

        return -1;
    }
}
