/**
 * @Author: Zhongming Yuan
 * @Date: 2021/11/28 7:57 下午
 */
public class GetPermutation {

    private boolean[] arr;

    private int n;

    private int[] factorial;

    public String getPermutation(int n, int k) {
        arr = new boolean[n];
        this.n = n;

        factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; ++i) {
            factorial[i] = factorial[i - 1] * i;
        }

        return permutation(n, k).toString();
    }

    public StringBuilder permutation(int j, int k) {
        if (k == 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (!arr[i]) {
                    sb.append(i + 1);
                }
            }

            return sb;
        }
        int f = factorial[j - 1];
        int c = (k - 1) / f;

        int i = 0;
        for (; i < n && c >= 0; i++) {
            if (!arr[i]) {
                c--;
            }
        }
        arr[i - 1] = true;
        return new StringBuilder().append(i).append(permutation(j - 1, k -  (k - 1) / f * f));
    }
}
