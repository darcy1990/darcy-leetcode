package number;

public class MaximumSwap {

    public int maximumSwap(int num) {
        String s = String.valueOf(num); // 用charArray ！！！
        int p1 = -1;
        int p2 = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '9') {
                continue;
            }

            if (p1 < 0) {
                p1 = i;

                char max = s.charAt(p1);
                p2 = p1;
                int pt = p1 + 1;
                while (pt < s.length()) {
                    if (s.charAt(pt) > s.charAt(p1) && s.charAt(pt) >= max) { // 98368，1993，corner case比较多，必须遍历后面所有的数字找到最大的，如果相同要取靠后面的数据
                        p2 = pt;
                        max = s.charAt(pt);
                    }
                    pt++;
                }

                if (p2 == p1) {
                    p1 = -1;
                    p2 = -1;
                    continue;
                }

                break;
            }
        }

        if (p1 < 0) {
            return num;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == p1) {
                sb.append(s.charAt(p2));
                continue;
            }
            if (i == p2) {
                sb.append(s.charAt(p1));
                continue;
            }
            sb.append(s.charAt(i));
        }

        return Integer.valueOf(sb.toString());
    }
}
