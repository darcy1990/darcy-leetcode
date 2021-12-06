import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/12 5:28 下午
 */
public class RestoreIpAddresses {

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() < 4) {
            return new ArrayList<>();
        }

        return find(0, null, s);
    }

    private List<String> find(int parts, String prefix, String s) {
        List<String> r = new ArrayList<>();
        if (parts > 4) {
            return r;
        }

        if (parts < 4 && s.length() / (4 - parts) > 3) {
            return r;
        }
        for (int i = 1; i < 4 && i <= s.length(); i++) {
            String m = s.substring(0, i);

            if ((m.length() > 1 && m.startsWith("0")) || Integer.parseInt(m) > 255){
                return r;
            }

            if (m.length() == s.length() && parts == 3) {
                r.add(prefix + "." + m);
                return r;
            }
            r.addAll(find(parts + 1, prefix == null ? m : prefix + "." + m, s.substring(i, s.length())));
        }

        return r;
    }
}
