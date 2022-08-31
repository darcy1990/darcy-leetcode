package number;

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length - 1; i >= 0; i--) {
            int c = citations.length - i;
            if (citations[i] <= c) {
                return citations[i];
            }
        }
        return 0;
    }
}
