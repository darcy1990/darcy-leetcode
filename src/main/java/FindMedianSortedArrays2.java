/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/1 6:02 下午
 */
public class FindMedianSortedArrays2 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }
        if (nums1.length == 0) {
            return mid(nums2, 0, nums2.length - 1);
        }
        if (nums2.length == 0) {
            return mid(nums1, 0, nums1.length - 1);
        }

        int l1 = nums1.length;
        int l2 = nums2.length;
        int c = (l1 + l2) / 2;
        if ((l1 + l2) % 2 == 0) {
            return ((double) index(nums1, nums2, c - 1) + (double) index(nums1, nums2, c)) / 2;
        } else {
            return index(nums1, nums2, c);
        }
    }

    private int index(int[] nums1, int[] nums2, int c) {
        int i = 0;
        int j = 0;
        int v = 0;
        while (true) {
            if (i == nums1.length) {
                v = nums2[j];
                j++;
            } else if (j == nums2.length) {
                v = nums1[i];
                i++;
            } else if (nums1[i] <= nums2[j]) {
                v = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                v = nums2[j];
                j++;
            }
            if (i + j == c + 1) {
                return v;
            }
        }
    }

    private double mid(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i];
        }

        if ((j - i + 1) % 2 == 0) {
            return ((double)nums[(i + j) / 2] + (double)nums[(i + j) / 2 + 1]) / 2;
        }

        return nums[(i + j) / 2];
    }
}
