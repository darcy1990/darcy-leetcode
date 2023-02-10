package number;

public class CountBits {

    public int[] countBits(int n) {
        if (n == 0) {
            return new int[]{0};
        }
        int[] ret = new int[n + 1];
        ret[0] = 0;
        ret[1] = 1;
        int b = 1;
        for (int i = 2; i < n + 1; i += b) {
            for (int j = i; j < i + b && j < n + 1; j++) {
                ret[j] = ret[j - b];
                if (j + b < n + 1) {
                    ret[j + b] = ret[j - b] + 1;
                }
            }

            b = b * 2;
        }

        return ret;
    }
}
