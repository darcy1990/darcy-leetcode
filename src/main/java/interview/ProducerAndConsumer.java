package interview;

import org.apache.commons.lang3.RandomUtils;

public class ProducerAndConsumer {

    private static Integer count = 0;

    public static final int EMPTY = 0;

    private static final Integer FULL = 10;

    public static final String LOCK = "lock";

    private static class Producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (LOCK) {
                    while (count == FULL) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    count++;
                    LOCK.notifyAll();
                }

                System.out.println(count);

                sleep(RandomUtils.nextInt(0, 1000));
            }
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (LOCK) {
                    while (count == EMPTY) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    count--;
                    LOCK.notifyAll();

                    System.out.println(count);
                }

                sleep(RandomUtils.nextInt(0, 1000));
            }
        }
    }

    private static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());
        producer.start();
        consumer.start();
    }
}
