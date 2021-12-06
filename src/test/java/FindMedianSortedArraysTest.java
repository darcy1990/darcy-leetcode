import org.junit.Test;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/9/1 5:22 下午
 */
public class FindMedianSortedArraysTest {

    @Test
    public void findMedianSortedArrays() {
        FindMedianSortedArrays2 f = new FindMedianSortedArrays2();
        double ans = f.findMedianSortedArrays(new int[]{}, new int[]{2, 3});
        System.out.println(ans);
    }
}