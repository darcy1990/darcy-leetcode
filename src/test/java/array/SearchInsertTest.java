package array;

import org.junit.Test;

public class SearchInsertTest {

    @Test
    public void searchInsert() {
        SearchInsert si = new SearchInsert();
        System.out.println(si.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(si.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(si.searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(si.searchInsert(new int[]{1, 2}, 3));
    }
}