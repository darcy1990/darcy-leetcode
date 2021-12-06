/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 11:43 上午
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        // 如果是负数，先取反码，补码 = 反码 + 1；注意负数的最高为1，所以返回结果加1
        int abs = n >= 0 ? n : Integer.MAX_VALUE - (-n) + 1;
        int c = 0;
        while (abs > 0) {
            int b = abs % 2;
            if (b == 1) c++;
            abs = abs / 2;
        }

        return n >= 0 ? c : c + 1;
    }
}
