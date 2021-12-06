/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 6:19 下午
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int close = nums[0] + nums[1] + nums[2];
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            int k = nums.length - 1;
            for (int j = i + 1; j < nums.length - 1; j++) {
                int c = close;
                while (k > j) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum - target > 0) {
                        c = sum;
                    } else {
                        c = Math.abs(sum - target) < Math.abs(c - target) ? sum : c;
                        break;
                    }

                    k--;
                }

                while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                    j++;
                }

                close = Math.abs(close - target) < Math.abs(c - target) ? close : c;
            }

            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return close;
    }

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = arr[low];

        while (i < j) {
            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
}
