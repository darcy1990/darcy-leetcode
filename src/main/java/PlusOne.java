/**
 * @Author: Zhongming Yuan
 * @Date: 2021/10/21 5:51 下午
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] ++;

            if (digits[i] <= 9) {
                carry = 0;
                break;
            } else {
                digits[i] = 0;
                carry = 1;
            }
        }

        if (carry == 0) {
            return digits;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        System.arraycopy(digits, 0, ans, 1, digits.length);

        return ans;
    }
}
