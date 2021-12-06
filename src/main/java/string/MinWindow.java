package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/12/4 4:51 下午
 */
public class MinWindow {

    private Map<Character, Integer> feq = new HashMap<>();

    public String minWindow(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (feq.containsKey(ch)) {
                int c = feq.get(ch);
                feq.put(ch, ++c);
            } else {
                feq.put(ch, 1);
            }
        }

        int mp1 = 0;
        int mp2 = 0;
        int mlen = Integer.MAX_VALUE;
        int total = t.length();
        int p1 = 0;
        int p2 = 0;
        while (p1 < s.length()) {
            // right boundary
            while (p2 < s.length() && total > 0) {
                char c2 = s.charAt(p2);
                if (feq.containsKey(c2)) {
                    int c = feq.get(c2);
                    if (c > 0) {
                        total--;
                    }
                    feq.put(c2, --c);
                }
                p2++;
            }

            if (total > 0) {
                break;
            }

            // left boundary
            while (true) {
                if (p1 >= p2) {
                    break;
                }
                char c1 = s.charAt(p1);
                if (!feq.containsKey(c1)) {
                    p1++;
                    continue;
                }
                if (feq.get(c1) < 0) {
                    int c = feq.get(c1);
                    feq.put(c1, ++c);
                    p1++;
                    continue;
                }
                break;
            }

            int len = p2 - p1;
            if (len < mlen) {
                mlen = len;
                mp1 = p1;
                mp2 = p2 - 1;
            }

            // move left boundary
            char c1 = s.charAt(p1);
            feq.put(c1, 1);
            p1++;
            total++;
        }

        return mlen == Integer.MAX_VALUE ? "" : s.substring(mp1, mp2 + 1);
    }

}
