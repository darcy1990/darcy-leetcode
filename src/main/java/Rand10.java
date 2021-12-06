/**
 * @Author: Zhongming Yuan
 * @Date: 2021/4/23 4:22 下午
 */
public class Rand10 {

    public int rand10() {
        int x, y, v;
        do {
            x = rand7();
            y = rand7();
            v = x + (y - 1) * 7;
        } while (v > 40);

        return 1 + (v
                - 1) % 10;
    }

    public int rand7() {
        return 0;
    }
}
