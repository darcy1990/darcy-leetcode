/**
 * @Author: Zhongming Yuan
 * @Date: 2021/5/21 10:52 上午
 */
public class Quicksort {

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
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
