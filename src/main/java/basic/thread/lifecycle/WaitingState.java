package basic.thread.lifecycle;

import basic.thread.modle.WaitingThread;

public class WaitingState implements Runnable{

  public static Thread t1;

  public static void main(String[] args) throws InterruptedException {
    t1 = new Thread(new WaitingState());
    t1.start();
    System.out.println("t1初始状态:" + t1.getState());
  }

  @Override
  public void run() {
    // 调用wait()
//    try {
//      t1.wait();
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    Thread t2 = new Thread(new WaitingThread());
    t2.start();
    try {
      // 调用join方法，会join到当前t1的线程，t1线程会waiting
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // TERMINATED
    System.out.println("t2的状态:" + t2.getState());
  }
}
