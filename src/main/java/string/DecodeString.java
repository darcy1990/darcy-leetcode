package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 3:40 下午
 */
public class DecodeString {

    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                List<Character> l = new ArrayList<>();
                while (stack.peek() != '[') {
                    l.add(stack.pop());
                }
                stack.pop();
                Collections.reverse(l);

                // repeat times
                int times = 0;
                int exp = 0;
                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    times += exp10(exp) * (stack.pop() - '0');
                    exp++;
                }

                // repeat and push to stack
                for (int j = 0; j < times; j++) {
                    for (int k = 0; k < l.size(); k++) {
                        stack.push(l.get(k));
                    }
                }
            } else {
                stack.push(c);
            }
        }
        // 3[a2[c]]

        char[] chars = new char[stack.size()];
        int i = chars.length - 1;
        while (!stack.isEmpty()) {
            chars[i--] = stack.pop();
        }

        return new String(chars);
    }

    private int exp10(int n) {
        int c = 1;
        for (int i = 0; i < n; i++) {
            c *= 10;
        }

        return c;
    }
}
