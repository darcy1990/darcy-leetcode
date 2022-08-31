package array;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FrequencySort {

    public String frequencySort(String s) {
        int[] arr = new int[58];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            arr[chars[i] - 'A']++;
        }

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            pairs.add(new Pair<>(arr[i], i));
        }

        Collections.sort(pairs, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o2.getKey().compareTo(o1.getKey());
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Pair<Integer, Integer> pair : pairs) {
            String k = Character.toString((char) ('A' + pair.getValue()));
            for (int i = 0; i < pair.getKey(); i++) {
                sb.append(k);
            }
        }

        return sb.toString();
    }

}
