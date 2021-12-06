/**
 * @Author: Zhongming Yuan
 * @Date: 2021/7/2 5:10 下午
 */
public class Foo {

    private volatile int c = 1;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        c++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (c % 2 != 0) {
            Thread.sleep(1);
        }
        printSecond.run();
        c++;

    }

    public void third(Runnable printThird) throws InterruptedException {
        while (c % 3 != 0) {
            Thread.sleep(1);
        }
        printThird.run();
        c++;
    }
}
