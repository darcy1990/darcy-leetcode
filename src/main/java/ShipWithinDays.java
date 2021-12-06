/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/12 4:03 下午
 */
public class ShipWithinDays {

    private int[] weights;

    private int days;

    public int shipWithinDays(int[] weights, int days) {
        this.weights = weights;
        this.days = days;

        int min = 0;
        for (int i = 0; i < weights.length; i++) {
            min = Math.max(min, weights[i]);
        }

        int max = 0;
        int bs = weights.length % days == 0 ? weights.length / days :   weights.length / days + 1;
        int s = 0;
        int block = 0;
        for (int i = 0; i < weights.length; i++) {
            block += weights[i];
            s++;
            if (s == bs) {
                max = Math.max(max, block);
                s = 0;
                block = 0;
            }
        }
        max = Math.max(max, block);
        return recursionBinarySearch(min, max);
    }

    public int recursionBinarySearch(int low, int high) {
        if (low > high) {
            return -1;
        }

        if (low == high) {
            return low;
        }

        if (low + 1 == high && !canShip(low)) {
            return high;
        }

        int middle = (low + high) / 2;
        if (canShip(middle)) {
            return recursionBinarySearch(low, middle);
        } else {
            return recursionBinarySearch(middle, high);
        }
    }

    private boolean canShip(int middle) {
        int c = 0;
        int w = 0;
        for (int i = 0; i < weights.length; i++) {
            if (w + weights[i] <= middle) {
                w += weights[i];
                continue;
            }

            w = weights[i];
            c++;
            if (c > days) {
                return false;
            }
        }

        if (w > 0) {
            c++;
            if (c > days) {
                return false;
            }
        }
        return true;
    }
}
