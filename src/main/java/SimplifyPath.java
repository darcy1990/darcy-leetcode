import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/7 5:42 下午
 */
public class SimplifyPath {

    private Stack<String> s = new Stack<>();

    public String simplifyPath(String path) {
        if (path == null || path.equals("/")) {
            return path;
        }

        String[] arr = path.split("\\/");

        for (int i = 0; i < arr.length; i++) {
            String a = arr[i];
            if (a == null || a.equals("")) {
                continue;
            }

            if (a.equals(".")) {
                continue;
            }

            if (a.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
                continue;
            }

            s.push(a);
        }

        StringBuilder k = new StringBuilder();
        while(!s.isEmpty()) {
            k = new StringBuilder("/" + s.pop()).append(k);
        }


        String ks = k.toString();
        return ks == null || ks.equals("") ? "/" : ks;
    }
}
