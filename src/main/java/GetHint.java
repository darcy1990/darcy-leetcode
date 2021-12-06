/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/28 6:22 下午
 */
public class GetHint {

    public String getHint(String secret, String guess) {
        if (secret.length() == 0) {
            return "0A0B";
        }
        int[] arr = new int[10];
        char[] c1 = secret.toCharArray();
        char[] c2 = guess.toCharArray();
        int a = 0;
        int b = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c2[i]) {
                a++;
                continue;
            }
            arr[c1[i] - 48]++;
        }

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c2[i]) {
                continue;
            }
            if (arr[c2[i] - 48] > 0) {
                b++;
                arr[c2[i] - 48]--;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(a).append('A').append(b).append('B').toString();
    }
}
