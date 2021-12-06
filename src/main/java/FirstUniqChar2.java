/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/12 4:56 下午
 */
public class FirstUniqChar2 {

    public char firstUniqChar(String s) {
        int[] a = new int[200];
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            a[c]++;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (a[c] == 1) {
                return c;
            }
        }
        return ' ';
    }
}
