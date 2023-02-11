package interview;

import java.util.concurrent.BlockingQueue;

public abstract class ThreadSafeBlockingQueue implements BlockingQueue<Integer> {

    private Integer[] array;

    private int p1;

    private int p2;

    private Object offerLock = new Object();

    private Object takeLock = new Object();

    @Override
    public void put(Integer v) {
        synchronized (offerLock) {
            array[p1] = v;
        }
    }

    @Override
    public Integer take() throws InterruptedException {
        synchronized (takeLock) {
            int k = array[p2];
            array[p2] = null;
            return k;
        }
    }
}
