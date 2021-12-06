import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/16 5:59 下午
 */
public class Trap {

    public int trap(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        // 先sort，确定最高点，然后次高点，如果其他点落入他们之间，就忽略掉，这样就可以算出柱子 + 雨水的面积，然后再减去柱子的面积即可
        Map<Integer, Set<Integer>> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int len = height.length;
        for (int i = 0; i < len; i++) {
            int k = height[i];
            Set<Integer> s;
            if (map.containsKey(k)) {
                s = map.get(k);
            } else {
                s = new HashSet<>();
            }
            s.add(i);
            map.put(k, s);
        }

        int[] t = new int[height.length];
        int min = -1;
        int max = -1;
        for (Map.Entry<Integer, Set<Integer>> e: map.entrySet()) {
            int k = e.getKey();
            Set<Integer> v = e.getValue();
            for (Integer p : v) {
                if (min < 0 && max < 0) {
                    t[p] = k;
                    min = p;
                    max = p;
                } else {
                    if (p < min) {
                        t[p] = k;
                        min = p;
                    } else if (p > max) {
                        t[p] = k;
                        max = p;
                    }
                }
            }
        }

        int paint = 0;
        int pre = 0;
        for (int i = 1; i < t.length; i++) {
            int l = t[pre];
            int r = t[i];
            if (r > 0) {
                int m = Math.min(r, l);
                if (r >= l) {
                    paint += (i - pre) * m;
                } else {
                    paint += (i - pre) * m + l - r;
                }

                pre = i;
            }
        }

        paint += t[pre];

        int pillar = 0;
        for (int i = 0; i < height.length; i++) {
            pillar += height[i];
        }


        return paint - pillar;
    }
}
