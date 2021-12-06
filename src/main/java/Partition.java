import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 11:28 上午
 */
public class Partition {

    private Map<String, List<List<String>>> cache = new HashMap<>();

    private char[] chars;

    private String str;

    public List<List<String>> partition(String s) {
        if (s == null || s.length() == 0) {
            return new ArrayList<>();
        }

        chars = s.toCharArray();
        this.str = s;

        return partitionRecursive(s, 0);
    }

    private List<List<String>> partitionRecursive(String cacheStr, int from) {
        if (cache.containsKey(cacheStr)) {
            return cache.get(cacheStr);
        }
        List<List<String>> ret = new ArrayList<>();
        if (cacheStr == null || cacheStr.length() == 0) {
            return ret;
        }

        for (int i = from; i <= str.length() - 1; i++) {
            if (i == from || isPali(from, i)) {
                List<List<String>> rr = partitionRecursive(str.substring(i + 1), i + 1);
                // last segment
                if (rr.isEmpty()) {
                    List<String> t = new ArrayList<>();
                    t.add(str.substring(from, i + 1));
                    ret.add(t);
                } else {
                    for (List<String> l : rr) {
                        List<String> t = new ArrayList<>();
                        t.add(str.substring(from, i + 1));
                        t.addAll(l);
                        ret.add(t);
                    }
                }
            }
        }

        cache.put(cacheStr, ret);

        return ret;
    }

    private boolean isPali(int i, int j) {
        for (int k = i; k <= (i + j) / 2; k++) {
            if (chars[k] != chars[j - (k - i)]) {
                return false;
            }
        }

        return true;
    }
}
