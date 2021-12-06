import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/18 10:18 上午
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        Integer[] n = new Integer[nums.length];
        boolean isAllZero = true;
        for (int i = 0; i < nums.length; i++) {
            n[i] = nums[i];
            if (nums[i] > 0) {
                isAllZero = false;
            }
        }

        if (isAllZero) {
            return "0";
        }

        Arrays.sort(n, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == 0) {
                    return 1;
                }
                if (o1 == o2) {
                    return 0;
                }

                // too complex and wrong
                int[] arr1 = bits(o1);
                int[] arr2 = bits(o2);
                for (int i = 0; ; i++) {
                    if (i == arr1.length && i == arr2.length) {
                        return 1;
                    }

                    if (i == arr1.length && i < arr2.length) {
                        return arr1[0] > arr2[i] ? -1 : 1;
                    }

                    if (i < arr1.length && i == arr2.length) {
                        return arr1[i] > arr2[0] ? -1 : 1;
                    }

                    if (arr1[i] == arr2[i]) {
                        continue;
                    }

                    return arr1[i] > arr2[i] ? -1 : 1;
                }
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            sb.append(n[i]);
        }

        return sb.toString();
    }

    private int[] bits(Integer a) {
        Stack<Integer> s = new Stack<>();
        while (a > 0) {
            int b = a % 10;
            s.push(b);
            a = a / 10;
        }

        int[] arr = new int[s.size()];
        int i = 0;
        while (!s.isEmpty()) {
            arr[i++] = s.pop();
        }

        return arr;
    }
}
