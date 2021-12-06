/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/9 6:13 下午
 */
public class MinArray {

    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }

        int a = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < a) {
                return numbers[i];
            }
        }

        return a;
    }
}
