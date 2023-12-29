package basic.pratices.thread;

public class DeadLockPractice {
    static final Object LOCK_A = new Object();
    static final Object LOCK_B = new Object();

    public static void main(String[] args) {
        // 必须保证两个线程获取释放锁的顺序是一样的
        new DThread1().start();
        new DThread2().start();
    }

    static void sleep1s() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DThread1 extends Thread {
    public void run() {
        System.out.println("Thread-1: try get lock A...");
        synchronized (DeadLockPractice.LOCK_A) {
            System.out.println("Thread-1: lock A got.");
            DeadLockPractice.sleep1s();
            System.out.println("Thread-1: try get lock B...");
            synchronized (DeadLockPractice.LOCK_B) {
                System.out.println("Thread-1: lock B got.");
                DeadLockPractice.sleep1s();
            }
            System.out.println("Thread-1: lock B released.");
        }
        System.out.println("Thread-1: lock A released.");
    }
}

class DThread2 extends Thread {

    public void run() {
        System.out.println("Thread-2: try get lock B...");
        synchronized (DeadLockPractice.LOCK_A) {
            System.out.println("Thread-2: lock B got.");
            DeadLockPractice.sleep1s();
            System.out.println("Thread-2: try get lock A...");
            synchronized (DeadLockPractice.LOCK_B) {
                System.out.println("Thread-2: lock A got.");
                DeadLockPractice.sleep1s();
            }
            System.out.println("Thread-2: lock A released.");
        }
        System.out.println("Thread-2: lock B released.");
    }
}


