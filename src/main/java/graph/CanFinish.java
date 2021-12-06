package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/27 5:36 下午
 */
public class CanFinish {

    private Map<Integer, Set<Integer>> m;

    // v is scan?
    private boolean[] vk;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) {
            return true;
        }
        m = new HashMap<>();
        vk = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int p = prerequisites[i][0];
            int q = prerequisites[i][1];
            Set<Integer> c;
            if (m.containsKey(p)) {
                c = m.get(p);
            } else {
                c = new HashSet<>();
            }
            c.add(q);
            m.put(p, c);
        }

        for (int i = 0; i < numCourses; i++) {
            if (vk[i]) {
                continue;
            }
            // vp is scan ?
            boolean[] vp = new boolean[numCourses];
            boolean r = dfs(i, vp);
            if (!r) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int n, boolean[] vp) {
        if (vp[n]) {
            return false;
        }
        if (vk[n]) {
            return true;
        }
        vk[n] = true;
        vp[n] = true;
        Set<Integer> s = m.get(n);
        if (s == null) {
            vp[n] = false;
            return true;
        }
        for (Integer i : s) {
            boolean r = dfs(i, vp);
            if (!r) {
                return false;
            }
        }

        vp[n] = false;

        return true;
    }
}
