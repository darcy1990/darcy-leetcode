/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/3 6:23 下午
 */
public class IsMatch {

    private char[] sArray;

    private int sLen;

    private char[] pArray;

    private int pLen;

    public boolean isMatch(String s, String p) {
        sArray = s.toCharArray();
        pArray = p.toCharArray();
        sLen = s.length() - 1;
        pLen = p.length() - 1;
        return isMatch(0, 0);
    }

    public boolean isMatch(int sp, int pp) {
        if (pp > pLen) {
            return sp > sLen;
        }

        char c = pArray[pp];
        if (pp == pLen) {
            if (c == '.') {
                return sp == sLen;
            }
            return sp == sLen && sArray[sp] == c;
        } else {
            char m = pArray[pp + 1];
            if (m == '*') {
                if (c == '.') {
                    for (int i = sp - 1; i <= sLen; i++) {
                        boolean match = isMatch(i + 1, pp + 2);
                        if (match) {
                            return true;
                        }
                    }
                } else {
                    for (int i = sp - 1; i <= sLen; i++) {
                        if (i >= sp && sArray[i] != c) {
                            break;
                        }
                        boolean match = isMatch(i + 1, pp + 2);
                        if (match) {
                            return true;
                        }
                    }
                }
            } else {
                if (sp > sLen) {
                    return false;
                }
                if (c != '.' && sArray[sp] != c) {
                    return false;
                }
                return isMatch(sp + 1, pp + 1);
            }
        }

        return false;
    }
}
