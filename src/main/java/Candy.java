import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/9 5:16 下午
 */
public class Candy {

    private int[] ratings;

    public int candy(int[] ratings) {
        this.ratings = ratings;
        Integer up = null;
        int start = 0;
        List<Range> ranges = new ArrayList<>();
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                if (up == null) {
                    up = 1;
                } else if (up == -1) {
                    ranges.add(new Range(start, i - 1));
                    start = i - 1;
                    up = 1;
                }
            } else if (ratings[i] == ratings[i - 1]) {
                ranges.add(new Range(start, i - 1));
                start = i;
                up = null;
            } else {
                if (up == null) {
                    up = -1;
                } else if (up == 1) {
                    ranges.add(new Range(start, i - 1));
                    start = i - 1;
                    up = -1;
                }
            }
        }

        ranges.add(new Range(start, ratings.length - 1));

        int count = 0;
        Range r = ranges.get(0);
        count += count(r.e - r.s + 1);
        Range pre = r;
        for (int i = 1; i < ranges.size(); i++) {
            Range cur = ranges.get(i);
            if (pre.up == cur.up) {
                count += count(cur.e - cur.s + 1);
            } else if (pre.up > cur.up) {
                count += count(cur.e - cur.s + 1) - (pre.eq || pre.e < cur.s ?  0 : Math.min(pre.max, cur.max));
            } else {
                count += cur.eq ? 1 : (count(cur.e - cur.s + 1) -  (pre.e < cur.s ? 0 : 1));
            }

            pre = cur;
        }

        return count;
    }

    private class Range {

        public int s;

        public int e;

        public int up;

        public int max;

        private boolean eq;

        public Range( int s, int e) {
            this.s = s;
            this.e = e;
            up = ratings[s] <= ratings[e] ? 1 : -1;
            max = e - s + 1;
            eq = s == e;
        }
    }

    private int count(int c) {
        return (int) ((double) (1 + c) / 2 * c);
    }
}
