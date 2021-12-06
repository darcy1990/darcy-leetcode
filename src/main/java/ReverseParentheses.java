import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/28 6:16 下午
 */
public class ReverseParentheses {

    public String reverseParentheses(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                List<Character> l = new ArrayList<>();
                Character cc = stack.pop();
                while (cc != '(') {
                    l.add(cc);
                    cc = stack.pop();
                }

                for (int j = 0; j < l.size(); j++) {
                    stack.add(l.get(j));
                }
            } else {
                stack.add(c);
            }
        }

        List<Character> l = new ArrayList<>();
        while (!stack.isEmpty()) {
            Character cc = stack.pop();
            l.add(cc);
        }

        int len = l.size();
        char[] ch = new char[len];
        for (int i = 0; i < len; i++) {
            ch[i] = l.get(len - 1 - i);
        }

        return new String(ch);
    }
}
