import java.util.Stack;

public class ValidBracket {

    public static void main(String[] args) {
        ValidBracket v = new ValidBracket();
        v.isValid("(]");
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                Character p = stack.peek();
                if (isMatch(p, c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatch(char c, char p) {
        if ((c == '(' && p == ')')) {
            return true;
        }

        if ((c == '{' && p == '}')) {
            return true;
        }

        if ((c == '[' && p == ']')) {
            return true;
        }

        return false;
    }
}
