package number;

import org.junit.Test;

public class HammingDistanceTest {

    @Test
    public void hammingDistance() {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(12, 1));
    }
}