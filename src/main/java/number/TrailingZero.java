package number;

public class TrailingZero {

    private int trailingZero(int n) {
        if (n < 5) {
            return 0;
        }
        int total = 0;
        int d = 5;
        while (d <= n) {
            total += n / d * 1;
            d = d * 5;
        }
        return total;
    }
}
