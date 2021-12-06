package string;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/13 5:57 下午
 */
public class CompareVersion {

    public int compareVersion(String version1, String version2) {
        char[] c1 = version1.toCharArray();
        char[] c2 = version2.toCharArray();
        int p1 = 0;
        int p2 = 0;
        int k1 = 0;
        int k2 = 0;

        while (p1 < c1.length || p2 < c2.length) {
            while (p1 < c1.length && c1[p1] != '.') {
                if (c1[p1] != '0' || k1 > 0) {
                    k1 = k1 * 10 + c1[p1] - 48;
                }
                p1++;
            }

            while (p2 < c2.length && c2[p2] != '.') {
                if (c2[p2] != '0' || k2 > 0) {
                    k2 = k2 * 10 + c2[p2] - 48;
                }
                p2++;
            }


            if (k1 != k2) {
                return k1 > k2 ? 1 : -1;
            }

            k1 = 0;
            k2 = 0;

            p1++;
            p2++;
        }

        return 0;
    }
}
