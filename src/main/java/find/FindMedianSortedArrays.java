package find;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/30 6:09 下午
 */
public class FindMedianSortedArrays {

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
        return findMedianSortedArrays(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1);
    }

    public double findMedianSortedArrays(int[] nums1, int i1, int i2, int[] nums2, int j1, int j2) {
        double mid1 = mid(nums1, i1, i2);
        double mid2 = mid(nums2, j1, j2);
        if (mid1 != mid2) {
            if (mid1 > mid2) {
                return findMedianSortedArrays(nums1, i1, m(i1, i2), nums2, m(j1, j2) , j2);
            } else {
                return findMedianSortedArrays(nums1, m(i1, i2) / 2, i2, nums2, j2, m(j1, j2) / 2);
            }
        } else {
            return mid1;
        }
    }

    private int m(int i, int j) {
        return (i + j) % 2 == 0 ? (i + j) /2 : (i + j) /2 + 1;
    }

    private double mid(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i];
        }

        if ((j - i) % 2 == 0) {
            return (nums[(i + j) / 2 - 1] + nums[(i + j) / 2]) / 2;
        }

        return nums[(i + j) / 2];
    }
}
