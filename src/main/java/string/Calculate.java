package string;

import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/28 6:14 下午
 */
public class Calculate {

    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = 0;
        Stack<Character> os = new Stack<>();
        Stack<Integer> ns = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                n = push(n, os, ns);
                os.push(c);
            } else {
                n = n * 10 + (c - 48);
            }
        }

        push(n, os, ns);

        int ans = 0;
        while (!ns.isEmpty()) {
            int pre = ns.pop();
            if (ns.isEmpty()) {
                ans += pre;
                break;
            }
            char op = os.pop();
            if (op == '+') {
                ans += pre;
            } else {
                ans -= pre;
            }
        }

        return ans;
    }

    private int push(int n, Stack<Character> os, Stack<Integer> ns) {
        if (os.size() > 0) {
            char op = os.peek();
            if (op == '*' || op == '/') {
                os.pop();
                int pre = ns.pop();
                int k;
                if (op == '*') {
                    k = pre * n;
                } else {
                    k = pre / n;
                }
                ns.push(k);
            } else {
                ns.push(n);
            }
        } else {
            ns.push(n);
        }
        return 0;
    }
}
