/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/25 6:30 下午
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int c = 0;
        int i = chars.length - 1;
        while (i >= 0 && chars[i] == ' ') i--;
        while (i >= 0 && chars[i] != ' ') {
            i--;
            c++;
        }

        return c;
    }
}
