import java.util.Arrays;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/17 10:37 上午
 */
public class Trap2 {

    public int trap(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int len = height.length;
        int[] gt = new int[len];
        Arrays.fill(gt, -1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (gt[j] == -1 && height[i] >= height[j]) {
                    gt[j] = i;
                }
            }
        }

        //  has no higher pillar of right
        for (int i = 0; i < len; i++) {
            if (gt[i] < 0 && i + 1 < len) {
                int m = i + 1;
                for (int j = m; j < len; j++) {
                    if (height[j] > height[m]) {
                        m = j;
                    }
                }
                gt[i] = m;
            }
        }

        int water = 0;
        for (int i = 0; i < len;) {
            if (gt[i] > 0) {
                int min = Math.min(height[gt[i]], height[i]);
                water += min * (gt[i] - i) - pillar(height, i, gt[i], min);
                i = gt[i];
                continue;
            }
            i++;
        }

        return  water;
    }

    private int pillar(int[] height, int m, int n, int min) {
        int pillar = 0;
        for (int i = m; i < n; i++) {
            pillar += height[i] > min ? min : height[i];
        }

        return pillar;
    }
}
