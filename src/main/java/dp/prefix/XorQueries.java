package dp.prefix;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/1 4:06 下午
 */
public class XorQueries {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
        int xor = arr[0];
        prefix[0] = xor;
        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
            prefix[i] = xor;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                ans[i] = prefix[queries[i][1]];
            } else {
                ans[i] = prefix[queries[i][1]] ^ prefix[queries[i][0] - 1];
            }
        }

        return ans;
    }
}
