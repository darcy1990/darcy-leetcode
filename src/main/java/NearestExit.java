import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/27 5:07 下午
 */
public class NearestExit {

    public int nearestExit(char[][] maze, int[] entrance) {
        int len = maze.length;
        int width = maze[0].length;
        boolean[][] mark = new boolean[len][width];
        List<Pair<Integer, Integer>> pos = new ArrayList<>();
        int i = entrance[0];
        int j = entrance[1];
        pos.add(new Pair<>(i, j));

        int c = -1;
        while (!pos.isEmpty()) {
            List<Pair<Integer, Integer>> newPos = new ArrayList<>();
            c++;
            for (Pair<Integer, Integer> step : pos ) {
                Integer m = step.getKey();
                Integer n = step.getValue();
                if (m < 0 || m >= len || n < 0 || n >= width) {
                    continue;
                }
                if (mark[m][n]) {
                    continue;
                }
                if (maze[m][n] == '.' ) {
                    if (isExit(maze, m, n) && !(m == entrance[0] && n == entrance[1])) {
                        return c;
                    }
                    newPos.add(new Pair<>(m - 1, n));
                    newPos.add(new Pair<>(m + 1, n));
                    newPos.add(new Pair<>(m, n + 1));
                    newPos.add(new Pair<>(m, n - 1));
                }

                mark[m][n] = true;
            }

            pos = newPos;
        }

        return -1;
    }

    private boolean isExit(char[][] maze, int m, int n) {
        return (m == 0 || m == maze.length - 1 || n == 0 || n == maze[0].length - 1);
    }
}
