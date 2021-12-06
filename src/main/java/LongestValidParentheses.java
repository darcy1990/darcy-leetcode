import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/13 5:48 下午
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int max = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (stack.isEmpty() || c == '(') {
                stack.push(c);
            } else {
                if (stack.peek() == '(' && stack.size() == 1) {
                    stack.pop();
                    m += 2;
                } else {
                    stack.clear();
                    stack.push(c);
                    max = Math.max(max, m);
                    m = 0;
                }
            }
        }

        max = Math.max(max, m);

        return max;
    }
}
