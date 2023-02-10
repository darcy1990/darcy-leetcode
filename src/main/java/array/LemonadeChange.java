package array;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int fc = 0;
        int tc = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fc++;
                continue;
            }

            if (bills[i] == 10) {
                fc--;
                if (fc < 0) {
                    return false;
                }
                tc++;
                continue;
            }

            if (bills[i] == 20) {
                if (tc > 0) {
                    tc--;
                    fc--;
                } else {
                    fc -= 3;
                }
                if (fc < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
