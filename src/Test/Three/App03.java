package Test.Three;

import java.util.concurrent.locks.ReentrantLock;

/*Write three different method options for getNextValue() that will return 'value++', each
        method needs to be synchronized in a different way.*/

public class App03 {
    private int value = 0;

    public synchronized void firstWay() {
        this.value++;
    }

    private final Object close = new Object();

    public void secondWay() {
        synchronized (close) {
            value++;
        }
    }

    private final ReentrantLock lock = new ReentrantLock();

    public void thirdWay() {
        lock.lock();
        try {
            this.value++;
        } finally {
            lock.unlock();
        }
    }
}
