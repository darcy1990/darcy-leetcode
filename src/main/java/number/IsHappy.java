package number;

public class IsHappy {

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 4) {
            return false;
        }
        int sum = 0;
        while (n > 0) {
            int k = n % 10;
            sum += k * k;
            n = n / 10;
        }

        return isHappy(sum);
    }
}
