package array;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/6/9 5:56 下午
 */
public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m + n || j < n) {
            if (j == n) {
                break;
            }
            if (i - j == m) {
                for (; j < n; j++, i++) {
                   nums1[i] = nums2[j];
                }
                break;
            }
            if (nums1[i] <= nums2[j]) {
                i++;
                continue;
            } else {
                move(nums1, i, m + j);
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }
    }

    private void move(int[] nums, int i, int l) {
        for (int j = l; j > i; j--) {
            nums[j] = nums[j -1];
        }
    }
}
