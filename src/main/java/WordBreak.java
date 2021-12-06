import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/14 5:55 下午
 */
public class WordBreak {

    private Map<String, Boolean> cache = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) {
            return true;
        }

        if (cache.containsKey(s)) {
            return cache.get(s);
        }

        for (int i = 0; i < wordDict.size(); i++) {
            String suffix = wordDict.get(i);
            if (s.endsWith(suffix)) {
                boolean c = wordBreak(s.substring(0, s.length() - suffix.length()), wordDict);
                if (c) {
                    cache.put(s, true);
                    return true;
                }
            }
        }

        cache.put(s, false);
        return false;
    }
}
