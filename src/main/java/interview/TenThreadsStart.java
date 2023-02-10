package interview;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TenThreadsStart {

    public static CyclicBarrier cb = new CyclicBarrier(10); // 或者使用CountdownLatch

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadA t = new ThreadA();
            t.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            Thread.sleep(100 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    private static class ThreadA extends Thread {

        @Override
        public void run() {
            try {
                cb.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getName());
        }
    }
}
