package array;

public class TotalFruit {

    public int totalFruit(int[] fruits) {
        if (fruits.length == 1) {
            return fruits.length;
        }
        int max = 1;
        int m = fruits[0];
        int n = -1;
        int p1 = 0;
        int p2 = -1;
        for (int i = 1; i < fruits.length; i++) {
            if (p2 < 0) {
                if (fruits[i] == m) {
                    max = Math.max(max, i + 1);
                    continue;
                }

                n = fruits[i];
                p2 = i;
                max = Math.max(max, p2 - p1 + 1);
                continue;
            }

            if (fruits[i] == m || fruits[i] == n) {
                p2 = i;
                max = Math.max(max, p2 - p1 + 1);
                continue;
            }

            m = fruits[i - 1];
            n = fruits[i];
            int pre = i - 1;
            while (fruits[pre] == m) {
                pre--;
            }

            // fix
            if (fruits[pre] != m) {
                pre++;
            }

            // reset pointer
            p1 = pre;
            p2 = i;

            max = Math.max(max, p2 - p1 + 1);
        }

        return max;
    }
}
