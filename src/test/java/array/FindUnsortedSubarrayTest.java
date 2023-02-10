package array;

import org.junit.Test;

public class FindUnsortedSubarrayTest {

    @Test
    public void findUnsortedSubarray() {
        FindUnsortedSubarray f = new FindUnsortedSubarray();
        System.out.println(f.findUnsortedSubarray(new int[]{1, 2, 3, 3, 3}));
    }
}