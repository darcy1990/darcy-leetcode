/**
 * 2 * @Author: Zhongming Yuan
 * 3 * @Date: 2021/2/26 6:13 下午
 * 4
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String p = l.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        System.out.println(p);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        return longestCommonPrefix(strs[0], 1, strs);
    }

    private String longestCommonPrefix(String prefix, int i, String[] strs) {
        if (i >= strs.length) {
            return prefix;
        }

        if (strs[i].startsWith(prefix)) {
            return longestCommonPrefix(prefix, i + 1, strs);
        }

        String nPrefix = "";
        for (int j = 0; j < Math.min(prefix.length(), strs[i].length()); j++) {
            if (prefix.charAt(j) == strs[i].charAt(j)) {
                nPrefix += prefix.charAt(j) + "";
            } else {
                break;
            }
        }

        if (nPrefix.length() == 0) {
            return "";
        }

        return longestCommonPrefix(nPrefix, i + 1, strs);
    }
}
