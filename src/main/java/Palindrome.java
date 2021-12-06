public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.isPalindrome(121);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int len = 0;
        int x1 = x;
        while (x1 > 0) {
            x1 = x1 / 10;
            len++;
        }

        int[] arr = new int[len];
        int x2 = x;
        int i = 0;
        while (x2 > 0) {
            int m = x2 % 10;
            arr[i] = m;

            x2 = x2 / 10;
            i++;
        }

        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < arr.length && p2 >= 0 && p1 <= p2) {
            if (arr[p1] != arr[p2]) {
                return false;
            }
            p1++;
            p2--;
        }

        return true;
    }
}
