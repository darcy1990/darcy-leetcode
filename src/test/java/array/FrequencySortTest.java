package array;

import junit.framework.TestCase;

public class FrequencySortTest extends TestCase {

    public void testFrequencySort() {
        FrequencySort fs = new FrequencySort();
        System.out.println(fs.frequencySort("Aabbx"));
    }
}