package array;

import org.junit.Test;

public class TotalFruitTest {

    @Test
    public void totalFruit() {
        TotalFruit tf = new TotalFruit();
        System.out.println(tf.totalFruit(new int[]{1, 1}));
        System.out.println(tf.totalFruit(new int[]{0, 1, 2, 2}));
        System.out.println(tf.totalFruit(new int[]{1, 2, 3, 2, 2}));
        System.out.println(tf.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
        System.out.println(tf.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
        System.out.println(tf.totalFruit(new int[]{0, 0, 1, 1}));
        System.out.println(tf.totalFruit(new int[]{1, 0, 1, 4, 1, 4, 1, 2, 3}));
    }
}