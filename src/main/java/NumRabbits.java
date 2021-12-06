import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 4:03 下午
 */
public class NumRabbits {

    private Map<Integer, Integer> map = new HashMap<>();

    public int numRabbits(int[] answers) {
        for (int i = 0; i < answers.length; i++) {
            int a = answers[i];
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int t = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            int s = k + 1;
            if (v < s) {
                t += s;
                continue;
            }
            t += v % s == 0 ? v : (v / s + 1) * s;
        }

        return t;
    }
}
