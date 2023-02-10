package number;

public class IsAdditiveNumber {

    public boolean isAdditiveNumber(String num) {
        int[] arr = new int[num.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.charAt(i) - '0';
        }

        return backtrack(arr, 0, 0, 0, 0);
    }

    private boolean backtrack(int[] arr, int from, int v, int expected, int count) {
        int next = 0;
        // happy ending
        if (from == arr.length && count >= 3) {
            return true;
        }
        if (from >= arr.length || (arr[from] == 0 && expected != 0)) {
            return false;
        }
        for (int i = from; i < arr.length; i++) {
            next = next * 10 + arr[i];
            if (next == expected || count < 2) {
                boolean r = backtrack(arr, i + 1, next, next + v, count + 1);
                if (r) {
                    return true;
                }
            }

            // too large
            if (next > expected && count >= 2) {
                break;
            }
        }

        return false;
    }

}
