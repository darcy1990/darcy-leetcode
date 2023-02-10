package interview;

public class TwoThreadPrint {

    private static volatile int ctl = 0;

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
    }

    private static class A implements Runnable {

        @Override
        public void run() {
            while (true && count <= 100) {
                if (ctl == 0) {
                    System.out.println(count);
                    count++;
                    ctl = 1;
                }

            }

        }
    }

    private static class B implements Runnable {

        @Override
        public void run() {
            while (true && count <= 100) {
                if (ctl == 1) {
                    System.out.println(count);
                    count++;
                    ctl = 0;
                }

            }
        }
    }
}
