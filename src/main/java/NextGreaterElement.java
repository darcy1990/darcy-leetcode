/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/24 3:10 下午
 */
public class NextGreaterElement {

    public int nextGreaterElement(int n) {
        int l = (n + "").length();
        if (l == 1) {
            return -1;
        }

        // get arr
        int[] arr = new int[l];
        int m = n;
        int i = l - 1;
        while (m > 0) {
            int c = m % 10;
            arr[i] = c;
            i--;
            m = m / 10;
        }

        // 1 4 5 6 7 8 4 3 2

        // find 8
        int j = arr.length - 1;
        while (j > 0 && arr[j] <= arr[j - 1]) j--;

        if (j == 0) {
            return -1;
        }

        // find min > 7
        int min = arr[j];
        int mi = j;
        for (int o = mi; o < arr.length; o++) {
            if (arr[o] > arr[j - 1] && arr[o] < min) {
                min = arr[o];
                mi = o;
            }
        }

        // swap 7 & 8
        int c = arr[j - 1];
        arr[j - 1] = arr[mi];
        arr[mi] = c;

        quicksort(arr, j, arr.length - 1);

        int r = 0;
        for (int o = 0; o < arr.length; o++) {
            r = r * 10 + arr[o];
        }

        return r;
    }

    private static void quicksort(int[] array, int begin, int end) {
        if (begin < end) {
            int base = array[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                while (i < j && array[j] > base) {
                    j--;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }
                while (i < j && array[i] < base) {
                    i++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }
            }
            array[i] = base;
            quicksort(array, begin, i - 1);
            quicksort(array, i + 1, end);
        }
    }
}
