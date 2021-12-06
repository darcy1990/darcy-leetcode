import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/10 4:32 下午
 */
public class FindSubstring {

    public List<Integer> findSubstring(String s, String[] words) {
        // frequency
        Map<String, Integer> of = new HashMap<>();
        int len = words.length;
        int block = words[0].length();
        for (int i = 0; i < len; i++) {
            String w = words[i];

            if (of.containsKey(w)) {
                int f = of.get(w);
                of.put(w, f + 1);
            } else {
                of.put(w, 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < block; i ++) {
            Map<String, Integer> freq = new HashMap<>(of);
            int zeroCount = 0;
            // slide window
            for (int j = i; j + block <= s.length(); j += block) {
                String k = s.substring(j, j + block);
                if (freq.containsKey(k)) {
                    int c = freq.get(k);
                    if (c == 0) {
                        zeroCount--;
                    }
                    freq.put(k, --c);
                    if (c == 0) {
                        zeroCount++;
                    }
                }

                if (zeroCount == freq.size() || j >= i + block * len) {
                    // remove first block
                    if (j >= block * len) {
                        int j1 = j - (block * len);
                        String k1 = s.substring(j1, j1 + block);
                        if (freq.containsKey(k1)) {
                            int c = freq.get(k1);
                            if (c == 0) {
                                zeroCount--;
                            }
                            freq.put(k1, ++c);
                            if (c == 0) {
                                zeroCount++;
                            }
                        }
                    }

                    if (zeroCount == freq.size()) {
                        ans.add(j - block * (len - 1));
                    }
                }
            }
        }

        return ans;
    }
}
