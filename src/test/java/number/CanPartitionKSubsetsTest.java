package number;

import org.junit.Test;

public class CanPartitionKSubsetsTest {

    @Test
    public void canPartitionKSubsets() {
        CanPartitionKSubsets c = new CanPartitionKSubsets();
        System.out.println(c.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1, 4, 3, 2, 3, 5, 2, 1, 4, 3, 2, 3, 5, 2, 1, 4, 3, 2, 3, 5, 2, 1}, 4));
        System.out.println(c.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3));
        System.out.println(c.canPartitionKSubsets(new int[]{1, 1, 1, 1, 2, 2, 2, 2}, 4));
    }
}