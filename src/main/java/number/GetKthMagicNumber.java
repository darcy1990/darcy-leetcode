package number;

import java.util.*;

public class GetKthMagicNumber {

    public int getKthMagicNumber(int k) {
        if (k == 1) {
            return 1;
        }
        if (k == 2) {
            return 3;
        }
        if (k == 3) {
            return 5;
        }
        if (k == 4) {
            return 7;
        }
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(7);

        while (set.size() < 2 * k - 1) {
            Set<Integer> newSet = new HashSet<>();
            for (Integer i : set) {
                newSet.add(i);
                if (Integer.MAX_VALUE / 3 > i) {
                    newSet.add(i * 3);
                }
                if (Integer.MAX_VALUE / 5 > i) {
                    newSet.add(i * 5);
                }
                if (Integer.MAX_VALUE / 7 > i) {
                    newSet.add(i * 7);
                }
            }

            set = newSet;
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list.get(k - 2);
    }
}
