package string;

public class TranslateNum {

    public int translateNum(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        if (len == 1) {
            return 1;
        }

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i) - '0';
        }
        
        if (len == 2) {
            return isValid(arr, 0) ? 2 : 1;
        }

        int[] dp = new int[len];

        dp[0] = 1;
        dp[1] = isValid(arr, 0) ? 2 : 1;
        for (int i = 2; i < len; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] * (isValid(arr, i - 1) ? 1 : 0);
        }

        return dp[len - 1];
    }

    private boolean isValid(int[] arr, int i) {
        if (arr[i] == 0) {
            return false;
        }

        int m = arr[i] * 10 + arr[i + 1];

        return m <= 25;
    }
}
