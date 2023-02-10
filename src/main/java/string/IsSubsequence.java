package string;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < s.length()) {
            while (p2 < t.length() && t.charAt(p2) != s.charAt(p1)) {
                p2++;
            }

            // t's end
            if (p2 == t.length()) {
                break;
            }

            p1++;
            p2++;
        }

        // s's end
        return p1 == s.length();
    }
}
