/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/28 4:24 下午
 */
public class IsUnique {

    public boolean isUnique(String astr) {
        if (astr == null || astr.equals("")) {
            return true;
        }

        int[] arr = new int[256];
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (arr[c + 128] >= 1) {
                return false;
            } else {
                arr[c + 128] = 1;
            }
        }

        return true;
    }
}
