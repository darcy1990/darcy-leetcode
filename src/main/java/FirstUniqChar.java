import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/23 11:30 上午
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                set.add(c);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                return i;
            }
        }

        return -1;
    }
}
